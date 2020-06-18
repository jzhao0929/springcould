package com.study.springcould.pojo;

import java.io.Serializable;

/**
 * @Description 部门实体类
 * @Author jzhao
 * @Date 2020-6-16 23:31
 **/
public class Dept implements Serializable {
    private Long id;
    private String deptName;
    private String dbSource;

    public Dept() {
    }

    public Dept(String dbSource) {
        this.dbSource = dbSource;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }
}
