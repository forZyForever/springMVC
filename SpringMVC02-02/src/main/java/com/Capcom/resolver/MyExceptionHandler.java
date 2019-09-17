package com.Capcom.resolver;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;

public class MyExceptionHandler implements HandlerExceptionResolver {
    @Nullable
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object o, Exception e) {
        //e为异常信息
        ModelAndView modelAndView = new ModelAndView();
        //绑定视图
        modelAndView.setViewName("error");
        StringWriter stringWriter=new StringWriter();
        //将异常信息写入
        e.printStackTrace(new PrintWriter(stringWriter));
        //输出错误
        System.out.println(stringWriter.toString());
        return modelAndView;
    }
}
