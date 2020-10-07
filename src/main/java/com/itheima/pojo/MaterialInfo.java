package com.itheima.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@TableName("material_info")
@Data
public class MaterialInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mid")
    //编码
    private int mid;
    @Column(name = "material_name")
    //材料名称
    private String materialName;
    @Column(name = "mate_type_id")
    //材料类型id
    private String mateTypeId;
    @Column(name = "unit")
    //单位
    private String unit;
    @Column(name = "price")
    //售价
    private double price;
    @Column(name = "unit_model")
    //颜色
    private String unitModel;
    @Column(name = "color")
    //品牌
    private String color;
    @Column(name = "brand")
    //更新时间
    private String brand;
    @Column(name = "updateTime")
    //更新人
    private String updateTime;
    @Column(name = "updater")

    private String updater;
}
