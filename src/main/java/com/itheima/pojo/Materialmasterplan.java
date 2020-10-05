package com.itheima.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("project_purchase_plan")
public class Materialmasterplan {

            //查询材料总计划
    private String id;
    private String pid;

    private int     proid;
    private  int flowid;
    private  String planname;
    private  String applyer;
    private  String pdate;
    private  String comment;
    private  int approvestatus;

            //项目名称
    private String pname;

            //项目状态
    private  String name;







}
