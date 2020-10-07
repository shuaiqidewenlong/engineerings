package com.itheima.controller;

import com.itheima.pojo.ProjectInfo;
import com.itheima.pojo.SsPageProject;
import com.itheima.service.SsProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class SsProjectController {

    @Autowired
    SsProjectService ssProjectService;

    @PostMapping(value = "/findAll")
    public Map<String, Object> findAll(@RequestBody SsPageProject page) {
        return ssProjectService.findAll(page);
    }

    @GetMapping(value = "/findAllOne")
    public ProjectInfo findAllOne(String projectName) {
        return ssProjectService.findAllOne(projectName);
    }

    @GetMapping(value = "/findAlls")
    public List<ProjectInfo> findAlls() {
        return ssProjectService.findAlls();
    }
}
