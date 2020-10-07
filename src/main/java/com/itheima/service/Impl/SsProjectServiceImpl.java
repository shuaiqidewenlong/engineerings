package com.itheima.service.Impl;

import com.itheima.dao.SsProjectMapper;
import com.itheima.pojo.ProjectInfo;
import com.itheima.pojo.SsPageProject;
import com.itheima.service.SsProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class SsProjectServiceImpl implements SsProjectService {

    @Autowired
    private SsProjectMapper projectDao;
    @Override
    public Map<String, Object> findAll(SsPageProject page) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        int startPage = (page.getCurrentPage()-1) * page.getPageSize();
        page.setStartPage(startPage);
        //查询数据
        List<ProjectInfo> all = projectDao.findAll(page);
        //查询条数
        long count = projectDao.findCount();
        map.put("all",all);
        map.put("total",count);
        return map;
    }

    @Override
    public ProjectInfo findAllOne(String projectName) {
        return projectDao.findAllOne(projectName);
    }

    @Override
    public List<ProjectInfo> findAlls() {
        return projectDao.findAlls();
    }
}
