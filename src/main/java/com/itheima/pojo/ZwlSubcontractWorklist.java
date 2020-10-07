package com.itheima.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @program: engineerings
 * @author: wenlong
 * @create: 2020-10-05 16:55
 */
@Data
@TableName(value = "subcontracworklist")
public class ZwlSubcontractWorklist {
    private  int id;
    private  int laborid;
    private  String workconten;
    private  String unit;
    private  int  workcount;
    private  long  unitprice;
    private  long  sumprice;
}
