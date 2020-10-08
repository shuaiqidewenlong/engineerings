package com.itheima.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@TableName("projce_statass")
@Data
public class ProjceStatass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //项目状态编号
    private int id;
    @Column(name = "project_statuss")
    //项目状态
    private String projectStatus;
}
