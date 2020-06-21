package com.study.springcould;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Description 启动类
 * @Author jzhao
 * @Date 2020-6-17 9:25
 **/
@EnableConfigServer
@SpringBootApplication
public class Config_Server_3344 {
    public static void main(String[] args) {
        SpringApplication.run(Config_Server_3344.class,args);
    }
}
