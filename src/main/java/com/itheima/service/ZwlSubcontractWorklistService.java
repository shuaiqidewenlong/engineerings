package com.itheima.service;

import com.itheima.dao.ZwlSubcontractWorklistDao;
import com.itheima.pojo.ZwlSubcontractWorklist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: engineerings
 * @author: wenlong
 * @create: 2020-10-05 17:00
 */
@Service
public class ZwlSubcontractWorklistService {
    @Autowired
    ZwlSubcontractWorklistDao zwlSubcontractWorklistDao;

    public List<ZwlSubcontractWorklist> readSubcontractWorklistAll(int laborid){
        return zwlSubcontractWorklistDao.readSubcontractWorklist(laborid);
    }

    public int readSubcontractById(int id){
        return  zwlSubcontractWorklistDao.readSubcontractById(id);
    };
}
