package com.itheima.service.Impl;

import com.itheima.dao.SsProjectMapper;
import com.itheima.pojo.ProjectInfo;
import com.itheima.service.SsProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SsProjectServiceImpl implements SsProjectService {

    @Autowired
    private SsProjectMapper projectDao;
    @Override
    public List<ProjectInfo> findAll() {
        return projectDao.findAll();
    }
}
