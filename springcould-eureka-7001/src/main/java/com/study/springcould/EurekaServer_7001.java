package com.study.springcould;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description 启动类
 * @Author jzhao
 * @Date 2020-6-17 10:07
 **/
@SpringBootApplication
@EnableEurekaServer //EnableEurekaServer 服务端启动类，可以接受别人注册进来
public class EurekaServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001.class,args);
    }
}
