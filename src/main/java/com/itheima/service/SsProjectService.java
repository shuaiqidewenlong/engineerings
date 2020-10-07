package com.itheima.service;

import com.itheima.pojo.ProjectInfo;
import com.itheima.pojo.SsPageProject;

import java.util.List;
import java.util.Map;

public interface SsProjectService {
    public Map<String,Object> findAll(SsPageProject page);

    public ProjectInfo findAllOne(String projectName);

    public List<ProjectInfo> findAlls();

    public Map<String, Object> findAllBy(SsPageProject page);
}
