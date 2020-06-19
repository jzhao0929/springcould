package com.study.springcould.controller;

import com.study.springcould.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Description 部门消费者接口层，核心
 * @Author jzhao
 * @Date 2020-6-17 8:56
 **/
@RestController
public class DeptConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    //配置Ribbon后，‘REST_URL_PREFIX’应该是一个变量，通过服务名访问
    //private final static String REST_URL_PREFIX = "http://127.0.0.1:8001";
    private final static String REST_URL_PREFIX = "http://SPRINGCOULD-PROVIDER-DEPT";

    @PostMapping("/consumer/dept/add")
    public boolean addDept(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> queryAll(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
    }
}
