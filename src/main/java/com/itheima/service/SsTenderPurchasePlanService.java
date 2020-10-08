package com.itheima.service;

import com.itheima.pojo.SsTenderPurchasePlan;

import java.util.List;

public interface SsTenderPurchasePlanService {

    public List<SsTenderPurchasePlan> findsAll();

    public long findCount();
}
