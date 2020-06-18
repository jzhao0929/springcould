package com.study.springcould.controller;

import com.study.springcould.pojo.Dept;
import com.study.springcould.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @Description 提供Restful服务
 * @Author jzhao
 * @Date 2020-6-17 0:26
 **/

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id){
        return deptService.queryById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }

    /**
      * @Description: 获取注册进来的微服务的一些信息
      * @params: []
      * @return: java.lang.Object
      * @author: 2020-6-17 21:57 jzhao
      * @reviser and other massage: 
      */
    @GetMapping("/dept/discovery")
    public Object discovery(){
        List<String> services = client.getServices();
        System.out.println("discovery=>services" + services);
        //得到具体的微服务信息，通过具体的微服务id获取
        List<ServiceInstance> instances = client.getInstances("SPRINGCOULD-PROVIDER-DEPT");
        for (ServiceInstance instance : instances) {
             System.out.println(
                     instance.getHost()+"\t"+
                     instance.getUri()+"\t"+
                     instance.getPort()+"\t"+
                     instance.getServiceId()+"\t"

             );
        }
        return this.client;
    }
}
