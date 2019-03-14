package com.xdl.controller;

import com.xdl.bean.Dept;
import com.xdl.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/depts")
    public List<Dept> findAll(){
        List<Dept> depts = deptService.findAll();
        return depts;


    }

}
