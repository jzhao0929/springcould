package com.study.springcould.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author jzhao
 * @Date 2020-6-21 9:17
 **/
@RestController
public class ConfigClientController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;

    @Value("server.port")
    private String port;

    @GetMapping("/config")
    public String getConfig(){
        StringBuilder sb = new StringBuilder();
        sb.append("application:").append(applicationName);
        sb.append("eurekaServer:").append(eurekaServer);
        sb.append("port:").append(port);
        return sb.toString();
    }

}
