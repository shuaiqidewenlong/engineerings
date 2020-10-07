package com.itheima.controller;

import com.itheima.service.SsProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;


@Controller
public class SsProjectHtmlController {

    //项目的基本信息页面
    @GetMapping(value = "/ssproject")
    public String ssprojectquery() {
        return "ssprojectquery";
    }

    @Autowired
    SsProjectService projectService;

    //项目详细详细页面
    @GetMapping(value = "/project1")
    public String project(Map<String,Object> map,String projectName) {
        map.put("projectName",projectName);
        return "project1";
    }

    @GetMapping(value = "/boot")
    public String boot() {

        return "project1";
    }
}
