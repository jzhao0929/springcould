package com.study.springcould.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description Configuration --- applicationContext.xml
 * @Author jzhao
 * @Date 2020-6-17 9:01
 **/
@Configuration
public class ConfigBean {

    /**
      * @Description: 配置负载均衡实现RestTemplate
      * @params: []
      * @return: org.springframework.web.client.RestTemplate
      * @author: 2020-6-18 9:45 jzhao
      * @reviser and other massage: 
      */
    @Bean
    @LoadBalanced //Ribbon
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
