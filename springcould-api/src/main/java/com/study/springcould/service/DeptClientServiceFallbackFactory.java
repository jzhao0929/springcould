package com.study.springcould.service;

import com.study.springcould.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description Hystrix降级
 * @Author jzhao
 * @Date 2020-6-19 21:06
 **/
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept queryById(Long id) {
                Dept dept = new Dept();
                dept.setId(id);
                dept.setDeptName("id"+id+"Hystrix降级,没有信息--@Hystrix");
                dept.setDbSource("no this DbSource");
                return dept;
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public boolean addDept(Dept dept) {
                return false;
            }
        };
    }
}
