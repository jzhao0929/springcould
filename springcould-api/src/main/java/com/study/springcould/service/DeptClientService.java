package com.study.springcould.service;

import com.study.springcould.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

/**
 * @Description 此处的‘FeignClient’的方法上的Mapping对应于服务提供者的接口，即本项目中的8001、8002、8003的控制层接口
 * @Author jzhao
 * @Date 2020-6-19 9:01
 **/
@Component
@FeignClient(value = "SPRINGCOULD-PROVIDER-DEPT")
public interface DeptClientService {

   @GetMapping("/dept/get/{id}")
   Dept queryById(@PathVariable("id")Long id);

   @GetMapping("/dept/list")
   List<Dept> queryAll();

   @PostMapping("/dept/add")
   boolean addDept(Dept dept);
}
