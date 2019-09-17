package com.Capcom.controller;

import com.Capcom.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/hello")
public class helloController {
    @RequestMapping("/say")
    //使用request进行请求转发、使用response进行重定向
    //		注意:重定向无法访问WEB-INF中的资源
    //返回void
    public void say(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //response.sendRedirect("/hello.jsp");
        request.getRequestDispatcher("/hello.jsp").forward(request, response);
    }

    //返回字符串,使用springMvc自带的请求转发,和重定向
    @RequestMapping("/smc")
    public String req(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("自带请求转发");
        // return "forward:/WEB-INF/pages/success.jsp";
        return "redirect:/hello.jsp";
    }

    @RequestMapping("/model")
    public ModelAndView model(Model model) {
        //里面可以封装视图和模型
        ModelAndView modelAndView = new ModelAndView();
        //封装视图
        modelAndView.setViewName("success");
        //封装数据模型
        modelAndView.addObject("name","李白");
        return modelAndView;
    }

    @RequestMapping("/ajax")
    //json请求格式数据转化为javabean类型数据需加入1.请求格式application/json;charset=utf-8,
    // 2.@Requestbody注解   3.导入jackson依赖
    //将javabean格式数据响应到客户端
    //1.@ResponseBody加到类或者方法上都可以,
    @ResponseBody
    public User resp(@RequestBody User user) {
        System.out.println(user);
        user.setUsername("小龙女");
        user.setNickname("cc");
        return user;
    }

}
