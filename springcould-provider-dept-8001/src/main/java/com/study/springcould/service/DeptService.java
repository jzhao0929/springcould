package com.study.springcould.service;

import com.study.springcould.pojo.Dept;
import java.util.List;

public interface DeptService {
    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();
}
