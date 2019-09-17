package com.Capcom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/** * RestFul的url的风格:
 * 1. 尽量使用通用的协议:http、https
 * 2. 请求路径中尽量不要出现大写字母
 * 3. 请求路径中尽量使用"_"不要使用"-"
 * 4. 一个路径就表示一个资源
 * http://localhost:8833/hello/1*/
@Controller
@RequestMapping("/hello")
public class helloController {
    @RequestMapping(value ="/{id}",method =RequestMethod.GET)
    public String Demo01(@PathVariable("id") int a) {
        System.out.println("get方式:"+a);
        return "forward:/hello.jsp";
    }
    @RequestMapping(value="/{id}",method = RequestMethod.POST)
    public String Demo02(@PathVariable("id") int a) {
        System.out.println("post方式:"+a);
        return "redirect:/hello.jsp";
    }
    //获取请求头
    @RequestMapping("/header")
    public String Demo03(@RequestHeader("user-agent")String header){
        System.out.println(header);
        return "success";
    }
}
