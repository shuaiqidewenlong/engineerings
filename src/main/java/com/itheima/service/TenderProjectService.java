package com.itheima.service;

import com.itheima.dao.TenderProjectDao;
import com.itheima.pojo.TenderProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenderProjectService {
    @Autowired
    TenderProjectDao dao;
    public List<TenderProject> selectAll(){
        return dao.selectList(null);
    }
}
