package com.degradation.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

/**
 * @Description 表示 ：
 * @Author Shi You Qin
 * @Email secret620@163.com
 * @Date Create 18:10 2020/11/10
 **/
@Service
public class HystrixTestServiceImpl implements HystrixTestService {

    @HystrixCommand(fallbackMethod = "fallback1")
    public String test() {
        Integer.parseInt("x");
        return "service test";
    }

    public String fallback1(){
        return "服务降级：fallback1";
    }
}
