package com.itheima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: engineerings
 * @author: wenlong
 * @create: 2020-10-02 13:29
 */
@Controller
public class ZwlHtmlConroller {
    @Autowired
    HttpServletRequest httpServletRequest;

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

    @RequestMapping("lyear_ui_buttons")
    String lyear_ui_buttons(){
        return "lyear_ui_buttons";
    }

    @RequestMapping("lyear_pages_subcontract")
    String lyear_pages_subcontract(){
        //分包合同查询
        return  "lyear_pages_subcontract";
    }

    @RequestMapping("lyear_pages_processview")
    String lyear_pages_processview(int id){
        //流程查看
        //System.out.println(id);
        httpServletRequest.getServletContext().setAttribute("id",id);
        return  "lyear_pages_processview";
    }
    @RequestMapping("lyear_pages_gallery")
    String lyear_pages_gallery(){
        //进度款申报查询
        return  "lyear_pages_gallery";
    }
}
