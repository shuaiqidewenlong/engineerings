package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JzyController {
    @RequestMapping("test01")
    String test01(){
        return "test01";
    }
}
