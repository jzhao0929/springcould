package com.study.springcould.pojo;

import java.io.Serializable;

/**
 * @Description 部门实体类
 * @Author jzhao
 * @Date 2020-6-16 23:31
 **/
public class Dept implements Serializable {
    private Long deptno;
    private String deptname;
    private String db_source;

    public Dept() {
    }

    public Dept(String db_source) {
        this.db_source = db_source;
    }

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }
}
