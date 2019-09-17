package com.Capcom.controller;

import com.Capcom.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@Controller
@RequestMapping("/user")
@SessionAttributes(value = "u", types = User.class)
public class UserController {
    //用于获取指定cookie的名称的值
    @RequestMapping("/cookie")
    public String Demo01(@CookieValue(value = "JSESSIONID") String cookieValue, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * 1.ModelAttribute注解在方法上,且有返回值
     * 注解回将user返回到下面需要修改的user,
     * 让其在此基础上进行修改
     * 当表单中的对象属性提交不完整时使用
     */
/*    @ModelAttribute
    public User getUser(){
        User user = new User();
        user.setId(1);
        user.setUsername("弟弟");
        user.setPassword("654");
        user.setNickname("sz");
        user.setAddress("usa");
        return user;
    }*/
/*    @ModelAttribute
    public void getUser(Map<String, Object> map) {
        User user = new User();
        user.setId(1);
        user.setUsername("弟弟");
        user.setPassword("654");
        user.setNickname("sz");
        user.setAddress("usa");
        map.put("u", user);
    }

    *//**
     * 2.ModelAttribute注解在方法上,无返回值
     * 注解回将map來包装user返回到下面需要修改的user,现在其方法上加,
     * 然后在引用对象的方法参数上写modelAttribute注解,value写上要用对象的键
     * 让其在此基础上进行修改
     * 当表单中的对象属性提交不完整时使用
     *//*
    @RequestMapping("/update")
    public String Demo02(@ModelAttribute("u") User user) {
        System.out.println("修改的用户为" + user);
        return "success";
    }*/

    //model模型获取域对象
    //存放的域对象为request
    @RequestMapping("/context")
    public String Demo03(Model model) {
        model.addAttribute("msg", "张三");
        return "success";
    }

    //session域对象中的存取值以及清除
    @RequestMapping("/save")
    public String Demo04(int id, Model model) {
        System.out.println("存取值");
        User user = new User();
        user.setId(id);
        user.setUsername("刘亦菲");
        user.setPassword("698");
        user.setNickname("gg");
        user.setAddress("chn");
        //把对象信息存储到域对象中去
        //此类上需加sessionAttribute注解value写上域对象的键,这样可以存到与对象中去
        model.addAttribute("u", user);
        return "success";
    }

    @RequestMapping("/load")
    public String Demo05(ModelMap modelMap) {
        System.out.println("获取值");
        //modelmap可以获取域对象中的值
        User u = (User) modelMap.get("u");
        System.out.println(u);
        return "success";
    }
}
