package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JzjController {
    @RequestMapping("test01")
    String test01(){
        return "test01";
    }
}
