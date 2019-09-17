package com.Capcom.resolver;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**自定义拦截器
 * 1.实现handlerIntercept接口
 * 2.注册拦截处理器
 * */

public class myHandlerInterceptor implements HandlerInterceptor {
    //处理请求之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("在请求之前执行");
        //false表示拦截,true则表示放行
        return true;
    }

    //处理请求之后执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("在请求之后执行");
    }

    //在视图解析之后执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
