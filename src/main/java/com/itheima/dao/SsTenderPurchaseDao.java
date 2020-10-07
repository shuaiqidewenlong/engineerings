package com.itheima.dao;

import com.itheima.pojo.SsTenderPurchasePlan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SsTenderPurchaseDao {

    public List<SsTenderPurchasePlan> findsAll();

    public long findCount();
}
