package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SsMaterialsController {

    @GetMapping(value = "/SsFindAll")
    public String SsFindAll() {

        return "heloo";
    }
}
