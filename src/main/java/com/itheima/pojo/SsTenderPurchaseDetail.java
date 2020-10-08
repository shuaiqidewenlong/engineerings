package com.itheima.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@TableName("tender_purchase_detail")
public class SsTenderPurchaseDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idss")
    //编号
    private int idss;
    @Column(name = "plan_id")
    //采购计划id
    private int planId;
    @Column(name = "math_id")
    //物资id
    private int mateId;
    @Column(name = "buy_count")
    //估算数量
    private double buyCount;
    @Column(name = "use_dept")
    //物资采购单位
    private String useDept;
    @Column(name = "buy_time")
    //采购时间
    private String buyTime;
    @Column(name = "buy_address")
    //采购地点
    private String buyAdderss;
    @Column(name = "provider_name")
    //候选供应商名单
    private String providerName;







}
