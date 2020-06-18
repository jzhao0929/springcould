package com.study.springcould;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description 启动类
 * @Author jzhao
 * @Date 2020-6-17 0:34
 **/
@SpringBootApplication
@MapperScan("com.study.springcould.dao")
@EnableEurekaClient //在服务启动后自动注册到Eureka中
@EnableDiscoveryClient //服务发现，意义不大
public class DeptProvider_8003 {

     public static void main(String[] args) {
         SpringApplication.run(DeptProvider_8003.class,args);
     }

}
