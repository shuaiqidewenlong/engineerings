package com.itheima.service.Impl;

import com.itheima.dao.SsTenderPurchaseDao;
import com.itheima.pojo.SsTenderPurchasePlan;
import com.itheima.service.SsTenderPurchasePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Ss tender purchase plan service
 * @author sunshuang
 */
@Service
public class SsTenderPurchasePlanServiceImpl implements SsTenderPurchasePlanService {

    @Autowired
    SsTenderPurchaseDao ssTenderPurchaseDao;

    @Override
    public List<SsTenderPurchasePlan> findsAll() {
        return ssTenderPurchaseDao.findsAll();
    }


    @Override
    public long findCount() {
        return 0;
    }
}
