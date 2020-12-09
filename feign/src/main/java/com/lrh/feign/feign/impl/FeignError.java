package com.lrh.feign.feign.impl;

import com.lrh.feign.entity.Student;
import com.lrh.feign.feign.FeignProviderClient;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "Hystrix容错机制。在不改变各个微服务调用关系的前提下，针对错误情况进行预先处理。当错误无法进行时，fallback做一个降级处理。只要为了避免响应时间过长，或返回一个错误信息";
    }
}
