package com.itheima.service;

import com.itheima.pojo.Materialmasterplan;
import com.itheima.pojo.MaterialmasterplanPage;

import java.util.List;
import java.util.Map;

public interface MaterialmasterplanServices {

    //共有多少页
    Long countAll();

    //        <!--查询材料总计划-->
   Map<String,Object> selectAll(MaterialmasterplanPage page);


}
