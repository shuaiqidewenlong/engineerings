package com.itheima.controller;

import com.itheima.pojo.ZwlSubcontract;
import com.itheima.pojo.ZwlSubcontractPage;
import com.itheima.pojo.ZwlSubcontractWorklist;
import com.itheima.service.ZwlSubcontractService;
import com.itheima.service.ZwlSubcontractWorklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @program: engineerings
 * @author: wenlong
 * @create: 2020-10-03 10:36
 */
@RestController
public class ZwlController {
    @Autowired
    ZwlSubcontractService zwlSubcontractService;

    @Autowired
    ZwlSubcontractWorklistService zwlSubcontractWorklistService;

    @Autowired
    HttpServletRequest httpServletRequest;

    //模块六、分包管理 开始
        //1.分包合同  开始
        //1.0分包合同查询
        @RequestMapping("readSubcontractAll")
        Map<String,Object> readSubcontractAll(ZwlSubcontractPage zwlSubcontractPage){
            return zwlSubcontractService.readSubcontractAll(zwlSubcontractPage);
        }
        //1.1流程查看开始
        @RequestMapping("readSubcontractWorklist")
        List<ZwlSubcontractWorklist> readSubcontractWorklist(){
            int id =(int) httpServletRequest.getServletContext().getAttribute("id");
            //System.out.println(id);
            int laborid = zwlSubcontractWorklistService.readSubcontractById(id);
            //System.out.println(laborid);
            return zwlSubcontractWorklistService.readSubcontractWorklistAll(laborid);
        }
        @RequestMapping("readSubcontractOne")
        ZwlSubcontract readSubcontractOne(){
            int id =(int) httpServletRequest.getServletContext().getAttribute("id");
            return  zwlSubcontractService.readSubcontractOne(id);
        };
        //1.1流程查看结束
        //1.分包合同  结束
    //模块六、分包管理 结束
}
