package com.itheima.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@TableName("tender_purchase_plan")
@Data
public class SsTenderPurchasePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tppid")
    private int id;
    @Column(name = "pro_id")
    private int proId;
    @Column(name = "plan_editor")
    private String planEditor;
    @Column(name = "tdate")
    private String tdate;
    @Column(name = "comments")
    private String comments;
    @Column(name = "approve_statuss")
    private int approveStatuss;

    private SsApploveStatus ssApploveStatus;

    private SsApsTpp ssApsTpp;

    private SsTenderPurchasePlan ssTenderPurchasePlan;

    private SsTenderOfferCompare ssTenderOfferCompare;

    private SsTendeCompareDetail ssTendeCompareDetail;

    private MaterialInfo materialInfo;
}
