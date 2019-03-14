package com.xdl.service;

import com.xdl.bean.Dept;
import com.xdl.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    @Autowired
    private DeptMapper deptMapper;

    public List<Dept> findAll(){

        List<Dept> depts = deptMapper.findAll();
        return depts;

    }



}
