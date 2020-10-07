package com.itheima.dao;


import com.itheima.pojo.Materialmasterplan;
import com.itheima.pojo.MaterialmasterplanPage;

import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface MaterialmasterplanDao {
        //共有多少页
    @Select("SELECT COUNT(1) FROM project_purchase_plan")
    Long countAll();

    //        <!--查询材料总计划 分页-->
    @Select("SELECT * FROM project_purchase_plan,project,STATUS WHERE project_purchase_plan.`pid`=project.pid AND project_purchase_plan.`approvestatus`=status.`approvestatus` AND status.approvestatus=0 LIMIT #{start},#{pageSize}\n")
    List<Materialmasterplan> selectAll(MaterialmasterplanPage page);




    
}
