package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
//注释掉的这样可以实现,但是代码改不了啊,就是有没有配置文件的实现方式
//@ComponentScan(basePackages={"com.example.demo"}, excludeFilters =@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {PublicWebMvcConfig.class}))
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
