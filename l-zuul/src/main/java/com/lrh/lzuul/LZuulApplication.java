package com.lrh.lzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//包含了@EnableZuulServer,设置该类是网关的启动类
@EnableZuulProxy
//可以帮助SpringBoot应用将所有符合条件的@Configuration配置加载到当前SpringBoot创建并使用的ioc容器中
@EnableAutoConfiguration
public class LZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(LZuulApplication.class, args);
    }

}
