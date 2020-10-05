package com.itheima.controller;


import com.itheima.pojo.Materialmasterplan;
import com.itheima.pojo.MaterialmasterplanPage;
import com.itheima.service.MaterialmasterplanServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class FsnController {

    @Autowired
    MaterialmasterplanServices services;


    @GetMapping("selectAll")
    public Map<String, Object> selectAll(MaterialmasterplanPage page){
        System.out.println(page);
        System.out.println("=="+services.selectAll(page));
        return  services.selectAll(page);
    }
}
