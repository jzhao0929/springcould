package com.study.springcould.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.study.springcould.pojo.Dept;
import com.study.springcould.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description Hystrix熔断
 * @Author jzhao
 * @Date 2020-6-17 0:26
 **/

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;


    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixQueryById")
    public Dept queryById(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);
        if(dept==null){
            throw new RuntimeException("id=>" + id + "不存在");
        }
        return dept;
    }

    //备选方案
    public Dept hystrixQueryById(@PathVariable("id") Long id){
        Dept dept = new Dept();
        dept.setId(id);
        dept.setDeptName("id"+id+"Hystrix熔断,没有信息--@Hystrix");
        dept.setDbSource("no this DbSource");
        return dept;
    }


}
