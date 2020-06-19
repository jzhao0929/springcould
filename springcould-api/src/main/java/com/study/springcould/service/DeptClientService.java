package com.study.springcould.service;

import com.study.springcould.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Description TODO
 * @Author jzhao
 * @Date 2020-6-19 9:01
 **/
@FeignClient(value = "SPRINGCOULD-PROVIDER-DEPT")
public interface DeptClientService {

   @GetMapping("/feign/dept/get/{id}")
   Dept queryById(@PathVariable("id")Long id);

   @GetMapping("/feign/dept/list")
   Dept queryAll();

   @PostMapping("/feign/dept/add")
   void addDept(Dept dept);
}
