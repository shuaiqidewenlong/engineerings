package com.itheima.controller;

import com.itheima.pojo.JzyPage;
import com.itheima.pojo.TenderProjectInfo;
import com.itheima.service.TenderProjectInfoService;
import com.itheima.util.MoneyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("tpi")
public class TenderProjectInfoController {
    @Autowired
    TenderProjectInfoService service;

    @GetMapping("selectAll")
    public Map<String, Object> selectAll(JzyPage page){
        System.out.println(page);
//        try {
//            String ksdate=page.getPretenderdate();
//            //ksdate = ksdate.replace("Z", " UTC");//是空格+UTC
//            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");//格式化的表达式
//            Date d = format.parse(ksdate );
//            System.out.println(d);
//            System.out.println(format.format(d));
//            page.setPretenderdate(format.format(d));
//            System.out.println(page);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        return service.selectAll(page);
    }


    @GetMapping("selectByid")
    public TenderProjectInfo selectByid(int id){
        System.out.println(service.selectByid(id));
        return service.selectByid(id);
    }
}
