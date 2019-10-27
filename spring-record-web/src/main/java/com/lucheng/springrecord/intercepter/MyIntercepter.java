package com.lucheng.springrecord.intercepter;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * 通过实现 HandlerInterceptor的拦截器
 * 处于 http请求阶段
 * 不同于spring中的 面向切面编程
 * 但是核心思想都是一样的
 */
public class MyIntercepter implements HandlerInterceptor {
    //前置拦截器
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle ok");
        PrintWriter printWriter = response.getWriter();
        printWriter.write("authority false");
        return true;
    }
    //前置拦截器 通过之后会在该拦截器中 执行相应的拦截器处理逻辑
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle ok");
    }
    //后置拦截器
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        System.out.println("afterCompletion ok");
    }
}
