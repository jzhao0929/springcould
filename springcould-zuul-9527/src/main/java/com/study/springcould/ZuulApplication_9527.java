package com.study.springcould;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Description 启动类
 * @Author jzhao
 * @Date 2020-6-17 0:34
 **/
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication_9527 {

     public static void main(String[] args) {
         SpringApplication.run(ZuulApplication_9527.class,args);
     }

}
