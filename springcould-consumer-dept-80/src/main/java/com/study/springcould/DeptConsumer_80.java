package com.study.springcould;

import com.study.ribbonrule.RibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Description 启动类
 * @Author jzhao
 * @Date 2020-6-17 9:25
 **/

//Eureka与Ribbon整合后，客户端可以直接调用，不用关心IP与端口号
@SpringBootApplication
@EnableEurekaClient
//在微服务启动的时候就能去加载自定义的Ribbon类
@RibbonClient(name = "SPRINGCOULD-PROVIDER-DEPT",configuration = RibbonRule.class)
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class,args);
    }
}
