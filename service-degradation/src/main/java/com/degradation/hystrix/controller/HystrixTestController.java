package com.degradation.hystrix.controller;

import com.degradation.hystrix.service.HystrixTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 表示 ：
 * @Author Shi You Qin
 * @Email secret620@163.com
 * @Date Create 17:42 2020/11/10
 **/
@Component
@RestController
public class HystrixTestController {
    private HystrixTestService hystrixTestService;

    @RequestMapping(value = "test")
    public String test(){
        System.out.println(hystrixTestService);
        return "xxx";
    }

    @RequestMapping(value = "test2")
    public String test2(){
        hystrixTestService.test();
        return "xxx";
    }

    /**
     * 构造器注入
     * @param hystrixTestService
     */
    @Autowired
    public HystrixTestController(HystrixTestService hystrixTestService) {
        this.hystrixTestService = hystrixTestService;
    }
}
