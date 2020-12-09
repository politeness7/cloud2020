package com.lrh.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//声明该类是一个Eureka Server微服务，提供服务注册和服务发现功能。即注册中心
@EnableEurekaServer
@SpringBootApplication
public class RegesterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegesterApplication.class, args);
    }

}
