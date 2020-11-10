package com.degradation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 表示 ：
 * @Author Shi You Qin
 * @Email secret620@163.com
 * @Date Create 15:14 2020/11/10
 **/
@Configuration
@ComponentScan("com.degradation.hystrix")
@SpringBootApplication
public class DegradationApp {
    public static void main(String[] args) {
        SpringApplication.run(DegradationApp.class, args);
    }
}
