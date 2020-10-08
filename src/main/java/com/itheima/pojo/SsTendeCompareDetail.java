package com.itheima.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@TableName("tende_compare_detail")
public class SsTendeCompareDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tcdid")
    //编号
    private int tcdid;
    @Column(name = "c_id")
    //招标对比id
    private int Cid;
    @Column(name = "tender_content")
    //招标内容
    private String tenderContent;
    @Column(name = "unit")
    //单位
    private String unit;
    @Column(name = "work_count")
    //数量/工程量
    private String workCount;
    @Column(name = "base_price")
    //招标底价
    private double BasePrice;
    @Column(name = "tender_date")
    //日期
    private String tenderDate;
    @Column(name = "provider1")
    //供应商1
    private String provider1;
    @Column(name = "offer_price1")
    //价格1
    private double offerPrice1;
    @Column(name = "provider2")
    //供应商2
    private String provider2;
    @Column(name = "offer_price2")
    //价格2
    private double offerPrice2;
    @Column(name = "provider3")
    //供应商3
    private String provider3;
    @Column(name = "offer_price3")
    //价格3
    private double  offerPrice3;
}
