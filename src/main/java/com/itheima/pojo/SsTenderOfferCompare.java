package com.itheima.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@TableName("tender_offer_compare")
public class SsTenderOfferCompare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tcid")
    //对比编号
    private int tcid;
    @Column(name = "pro_idss")
    //项目id
    private int proIdss;
    @Column(name = "tcdate")
    //日期
    private String tcdate;
    @Column(name = "commentss")
    //编制人
    private String commentss;
    @Column(name = "attach_ids")
    //附件
    private String attachIds;
    @Column(name = "flow_idss")
    //流程id
    private int flowId;
    @Column(name = "approve_statusss")
    //审批状态
    private String approveStatusss;



}
