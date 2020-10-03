package com.itheima.dao;

import com.itheima.pojo.ProjectInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SsProjectMapper {
    public List<ProjectInfo> findAll();
}
