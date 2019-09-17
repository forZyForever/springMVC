package com.Capcom.controller;

import com.Capcom.domain.User;
import com.Capcom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
@SessionAttributes(value = "user",types = User.class)
public class Hellocontroller {
    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String Demo01(User user) {
        try {
            userService.register(user);
        } catch (Exception e) {
            e.printStackTrace();
            return "failed";
        }

        return "success";
    }
    @RequestMapping("/login")
    public String Demo02(String username, String password, Model model){
        Map<String,Object> map=new HashMap<>();
        map.put("username",username);
        map.put("password",password);
          User user= userService.login(map);
          if (user==null){
              model.addAttribute("msg","用户名或密码错误");
              return "forward:/login.jsp";
          }else {
              model.addAttribute("user",user);
          }
          return "welcome";
    }
    @RequestMapping("/car")
    public String Demo03(){
        return "car";
    }
}
