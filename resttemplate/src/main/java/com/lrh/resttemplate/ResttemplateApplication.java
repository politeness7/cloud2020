package com.lrh.resttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/*
* restemplate是spring框架提供的基于rest的服务组件，底层是对http请求及响应进行了封装，提供了很多访问rest服务的方法，可简化代码开发。
* */
@SpringBootApplication
public class ResttemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResttemplateApplication.class, args);
    }

    @Bean//添加到ioc
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
