package com.lrh.feign.feign;

import com.lrh.feign.entity.Student;
import com.lrh.feign.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

//访问的通去找lrh-provider   不通去feignError
@FeignClient(value = "lrh-provider",fallback = FeignError.class)
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();
    @GetMapping("/student/index")
    public String index();
}
