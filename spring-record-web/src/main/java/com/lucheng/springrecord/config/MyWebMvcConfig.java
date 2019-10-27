package com.lucheng.springrecord.config;

import com.lucheng.springrecord.intercepter.MyIntercepter;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

public class MyWebMvcConfig implements WebMvcConfigurer {
    //再此可以添加自己的spring组件，例如添加自己的拦截器
    //添加自己的视图解析器等等
    @Resource
    private MyIntercepter myIntercepter;
    //添加自己的拦截器
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myIntercepter).addPathPatterns("/**");
    }

}
