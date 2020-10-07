package com.itheima.controller;

import com.itheima.pojo.ProjectInfo;
import com.itheima.service.SsProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SsProjectController {

    @Autowired
    SsProjectService ssProjectService;
    @GetMapping(value = "/findAll")
    public List<ProjectInfo> findAll() {
        return ssProjectService.findAll();
    }
}
