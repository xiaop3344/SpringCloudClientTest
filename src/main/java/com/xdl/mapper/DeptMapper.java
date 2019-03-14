package com.xdl.mapper;


import com.xdl.bean.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptMapper {

    public List<Dept> findAll();


}
