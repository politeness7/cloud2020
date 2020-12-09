package com.lrh.ribbon.controller;

import com.lrh.ribbon.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/ribbon")
public class ribbonHandler {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/findAll")
    @ResponseBody
    public Collection<Student> findAll(){
        return restTemplate.getForObject("http://lrh-provider/student/findAll",Collection.class);
    }

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://lrh-provider/student/index",String.class);
    }
}
