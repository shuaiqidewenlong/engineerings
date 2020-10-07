package com.itheima.controller;

import com.itheima.pojo.SsTenderPurchasePlan;
import com.itheima.service.SsTenderPurchasePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class SsTenderPurchasePlanController {

    @Autowired
    SsTenderPurchasePlanService ssTenderPurchasePlanService;


    @GetMapping(value = "/findsAll")
    public Map<String,Object> findAll() {

        List<SsTenderPurchasePlan> all = ssTenderPurchasePlanService.findsAll();

        System.out.println(all);

        return null;
    }
}
