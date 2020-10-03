package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class JzyController {
    @GetMapping("bidding_jzy_item")
    String test01(){
        return "bidding_jzy_item";
    }
}
