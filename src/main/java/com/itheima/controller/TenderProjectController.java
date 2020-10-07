package com.itheima.controller;

import com.itheima.pojo.TenderProject;
import com.itheima.service.TenderProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tp")
public class TenderProjectController {
    @Autowired
    TenderProjectService service;
    @GetMapping("selectAll")
    public List<TenderProject> selectAll(){
        return service.selectAll();
    }
}
