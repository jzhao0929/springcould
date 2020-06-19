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
    //IRule接口
    //AvailabilityFilteringRule：先过滤掉跳闸的服务
    //RoundRobinRule：轮询
    //RandomRule：随机
    //RetryRule：会先按照轮询获取服务，如果获取失败，会在指定的时间内进行重试
    //WeightedResponseTimeRule：权重
    @Bean
    @LoadBalanced //Ribbon
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
