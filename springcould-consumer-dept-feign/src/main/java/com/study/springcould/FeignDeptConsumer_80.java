package com.study.springcould;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description 启动类
 * @Author jzhao
 * @Date 2020-6-17 9:25
 **/

//Eureka与Ribbon整合后，客户端可以直接调用，不用关心IP与端口号
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.study.springcould"})
public class FeignDeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer_80.class,args);
    }
}
