package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: engineerings
 * @author: wenlong
 * @create: 2020-10-02 13:29
 */
@Controller
public class HtmlConroller {

    @RequestMapping("login")
    String login(){
        return  "login";
    }
    @RequestMapping("index")
    String index(){
        return  "index";
    }
}
