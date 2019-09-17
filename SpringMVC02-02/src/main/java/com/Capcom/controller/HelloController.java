package com.Capcom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/hello")
/**自定义全局异常
 * 1.自定义异常处理器
 * 2.注册异常处理器
 * */
public class HelloController {
    @RequestMapping("/say")
    public String say() {
        //int num=10/0;
        return "success";
    }
    @RequestMapping("/before")
    public String before(){
        System.out.println("before正在执行");
        return "success";
    }

}
