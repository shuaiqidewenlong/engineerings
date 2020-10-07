package com.itheima.service;

import com.itheima.dao.ZwlSubcontractDao;
import com.itheima.pojo.ZwlSubcontract;
import com.itheima.pojo.ZwlSubcontractPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: engineerings
 * @author: wenlong
 * @create: 2020-10-03 16:45
 */
@Service
public class ZwlSubcontractService {
    @Autowired
    ZwlSubcontractDao zwlSubcontractDao;

     public Map<String,Object> readSubcontractAll(ZwlSubcontractPage zwlSubcontractPage){
        //查询页面数据
         Map<String,Object> map=new HashMap<>();
         List<ZwlSubcontract> zwlSubcontracts = zwlSubcontractDao.readSubcontractAll(zwlSubcontractPage);
         //查询多少条数据
         long aLong = zwlSubcontractDao.readSubcontractCount();
         //放入map中
         map.put("zwlSubcontracts",zwlSubcontracts);
         map.put("aLong",aLong);
         return map;
    }

    public  ZwlSubcontract readSubcontractOne(int id){
         return  zwlSubcontractDao.readSubcontractOne(id);
    };
}
