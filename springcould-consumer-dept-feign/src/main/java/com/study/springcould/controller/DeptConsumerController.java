package com.study.springcould.controller;

import com.study.springcould.pojo.Dept;
import com.study.springcould.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    private DeptClientService deptClientService;

    @PostMapping("/consumer/dept/add")
    public boolean addDept(Dept dept){
        return deptClientService.addDept(dept);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id){
        return deptClientService.queryById(id);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> queryAll(){
        return deptClientService.queryAll();
    }
}
