package com.itheima.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Project info
 * @author susshuang
 */
@TableName("project_info")
@Data
public class ProjectInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "project_name")
    private String projectName;
    @Column(name = "project_address")
    private String projectAddress;
    @Column(name = "project_tacker")
    private String projectTacker;
    @Column(name = "start_plan_date")
    private String startDate;
    @Column(name = "end_plan_date")
    private String endDate;
    @Column(name = "project_period")
    private String projectPeriod;
    @Column(name = " project_cost")
    private Double  project_cost;
    @Column(name = "cost_upper")
    private String costUpper;
    @Column(name = "espect_profit")
    private int espectProfit;
    @Column(name = "project_type")
    private int projectType;
    @Column(name = "quality_level")
    private String qualityLevel;
    @Column(name = "project_status")
    private String projectStatus;
    @Column(name = "flow_id")
    private int flowId;
    @Column(name = "approve_status")
    private String approveStatus;
    @Column(name = "build_company")
    private String buildCompany;
    @Column(name = "contactor")
    private String contactor;
    @Column(name = "contact_phone")
    private String contactPhone;
    @Column(name = "contact_address")
    private String contactAddress;
    @Column(name = "project_intrduce")
    private String projectIntrduce;
    @Column(name = "comment")
    private String comment;
    @Column(name = "creator")
    private String creator;
    @Column(name = "attach_ids")
    private String attachIds;
    @Column(name = "create_date")
    private String createDate;

}
