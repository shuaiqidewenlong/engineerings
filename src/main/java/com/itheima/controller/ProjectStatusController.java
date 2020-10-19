package com.itheima.controller;

import com.itheima.pojo.ProjceStatass;
import com.itheima.pojo.ProjectStatus;
import com.itheima.service.ProjectStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tp")
public class ProjectStatusController {
    @Autowired
    ProjectStatusService service;
    @GetMapping("selectAll")
    public List<ProjectStatus> selectAll(){
        return service.selectAll();
    }
}
