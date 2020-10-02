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
        return  "lyear_pages_login";
    }
    @RequestMapping("index")
    String index(){
        return  "index";
    }
    @RequestMapping("lyear_main")
    String lyear_main(){
        return  "lyear_main";
    }
}
