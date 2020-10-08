package com.itheima.service;

import com.itheima.dao.ProjectStatusDao;
import com.itheima.pojo.ProjectStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectStatusService {
    @Autowired
    ProjectStatusDao dao;

    public List<ProjectStatus> selectAll(){
        return dao.selectList(null);
    }
}
