package com.lrh.hystrix.feign;

import com.lrh.hystrix.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "lrh-provider")
public interface FeignProviderClient {
    //通过rest方式去请求 lrh-provider里的两个
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();
    @GetMapping("/student/index")
    public String index();
}
