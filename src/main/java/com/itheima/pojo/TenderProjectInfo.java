package com.itheima.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.data.annotation.Id;




@Data
@TableName("tender_project_info")
public class TenderProjectInfo {
    @TableId(value = "id",type = IdType.AUTO)
    private int id;
    @TableField(value = "project_name")
    private String projectname;
    @TableField(value = "project_intrduce")
    private String projectintrduce ;
    @TableField(value = "project_address")
    private String projectaddress;
    private int ids;
    @TableField(value = "project_statuss")
    private String projectstatuss;
    private String bidder;
    @TableField(value = "pretender_date")
    private String pretenderdate;
    @TableField(value = "pretender_fee")
    private String pretenderfee;
    @TableField(value = "pretender_amount")
    private String pretenderamount;
    private String pretenderamounts;
    @TableField(value = "build_company")
    private String buildcompany ;
    private String contactor ;
    @TableField(value = "contact_phone")
    private String contactphone;
    @TableField(value = "design_company")
    private String designcompany;
    @TableField(value = "supervider_company")
    private String supervidercompany;
    private String comment;
    private String creator;
    @TableField(value = "create_date")
    private String create_date;
    @TableField(value = "flow_id")
    private int flowid;
    @TableField(value = "approve_status")
    private String approvestatus;
    @TableField(value = "project_naturn")
    private String projectnaturn;



}
