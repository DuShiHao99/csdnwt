package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
@Component
public class ZiJiWebMvcConfig extends WebMvcConfigurationSupport {

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        System.out.println("已经添加拦截器");
        registry.addInterceptor(new ZiJiInterceptor()).addPathPatterns("/demo/**");
    }
}
