package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SsTenderPurchasePlanHtmlController {


    @GetMapping(value = "/TenderPurchasePlan")
    public String TenderPurchasePlan() {

        return "tenderPurchasePlan";
    }
}
