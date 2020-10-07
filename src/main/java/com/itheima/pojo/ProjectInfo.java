package com.itheima.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Project info
 *
 * @author susshuang
 */
@TableName("project_info")
@Data
public class ProjectInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //立项编号
    private Integer id;
    @Column(name = "project_name")
    //项目名称
    private String projectName;
    @Column(name = "project_address")
    //项目地址
    private String projectAddress;
    @Column(name = "project_tacker")
    //项目跟踪人
    private String projectTacker;
    @Column(name = "start_plan_date")
    //计划开始日期
    private String startDate;
    @Column(name = "end_plan_date")
    //计划结束日期
    private String endDate;
    @Column(name = "project_period")
    //工程工期
    private String projectPeriod;
    @Column(name = " project_cost")
    //工程造价
    private Double  projectCost;
    @Column(name = "cost_upper")
    //造价大写
    private String costUpper;
    @Column(name = "espect_profit")
    //预计利润
    private int espectProfit;
    @Column(name = "project_type")
    //项目类型
    private int projectType;
    @Column(name = "quality_level")
    // 质量等级
    private String qualityLevel;
    @Column(name = "project_status")
    //项目状态
    private String projectStatus;
    @Column(name = "flow_id")
    //流程ID
    private int flowId;
    @Column(name = "approve_status")
    //审批状态
    private String approveStatus;
    @Column(name = "build_company")
    //建设单位
    private String buildCompany;
    @Column(name = "contactor")
    //联系人
    private String contactor;
    @Column(name = "contact_phone")
    //联系电话
    private String contactPhone;
    @Column(name = "contact_address")
    //联系地址
    private String contactAddress;
    @Column(name = "project_intrduce")
    //项目简介
    private String projectIntrduce;
    @Column(name = "comment")
    //备注
    private String comment;
    @Column(name = "creator")
    //立项人
    private String creator;
    @Column(name = "attach_ids")
    //附件
    private String attachIds;
    @Column(name = "create_date")
    //更新时间
    private String createDate;

    //项目状态表
    private ProjceStatass projceStatass;

    //招标采购计划表
    private SsTenderPurchasePlan ssTenderPurchasePlan;

    //招标报价对比表
    private SsTenderOfferCompare ssTenderOfferCompare;


    //招标报价对比明细表
    private SsTendeCompareDetail ssTendeCompareDetail;

    //材料基础库表
    private MaterialInfo materialInfo;

    //投标项目信息表
    private SsTenderPurchaseDetail ssTenderPurchaseDetail;
}
