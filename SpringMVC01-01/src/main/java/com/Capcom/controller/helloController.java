package com.Capcom.controller;

import com.Capcom.domain.User;
import com.sun.deploy.nativesandbox.comm.Response;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/hello")
public class helloController {
    //测试访问
    @RequestMapping("/say")
    public String sayHello() {
        System.out.println("hello springMvc");
        return "success";
    }

    //获取简单类型请求参数
    //方法中的参数名称需和请求参数的键一致
    //请求参数名和方法的参数名不一致:使用RequestParam注解
    @RequestMapping("/simple")
    public String simple(@RequestParam(name = "username") String name) {
        System.out.println(name);
        return "success";
    }

    @RequestMapping("/register")
    //获取参数封装到JavaBean中
    //如果javabean的属性还是javabean,则写类名.属性名
    //如果javabean的属性是list集合,则写变量名[下标].属性名
    public String register(User user) {
        //@requestBody注解将请求体的内容赋值给user,只能在post中使用
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/map")
    //获取参数封装到map集合中去
    //需加入@requestparam注解
    public String registerMap(@RequestParam Map map) {
        System.out.println(map);
        return "success";
    }

    @RequestMapping("/list")
    //获取参数封装到list,需加注解
    public String registerList(@RequestParam List<Object> id) {
        System.out.println(id);
        return "success";
    }

    @RequestMapping("/params")
    //@RequestParam注解可以获取指定参数请求参数的name,required为true表示必须携带参数,default表示默认
    public String registerParams(@RequestParam(name = "username", required = false, defaultValue = "弟弟") String name) {
        System.out.println(name);
        return "success";
    }

    @RequestMapping("/redirect")
    //重定向
    public void registerRedirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("http://www.baidu.com");
    }

    @RequestMapping("/body")
    //获取请求体参数
    public String registerBody(@RequestBody String body) {
        System.out.println(body);
        return "success";
    }

}
