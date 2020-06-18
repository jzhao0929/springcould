package com.study.springcould.dao;

import com.study.springcould.pojo.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();
}
