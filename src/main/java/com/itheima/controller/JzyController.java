package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class JzyController {
    @GetMapping("bidding_jzy_item")
    String test01(){
        return "bidding_jzy_item";
    }

    @GetMapping("bidding_jzy_process")
    String test02(Map<String,Object> map,int id){
        //System.out.println(id);
        map.put("tpid",id);
        return "bidding_jzy_process";
    }
}
