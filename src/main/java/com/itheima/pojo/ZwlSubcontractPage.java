package com.itheima.pojo;

import lombok.Data;

/**
 * @program: engineerings
 * @author: wenlong
 * @create: 2020-10-04 17:40
 */
@Data
public class ZwlSubcontractPage {
    //项目名称
    private  String  pname;

    //合同名称
    private  String  contractname;

    //分包单位
    private  String subcontractorsshall;

    //签订人
    private  String  contractsignatory;

    //审批状态
    private  String  approvestatus;

    //开始时间
    private  String  startdate1;

    //结束时间
    private  String  enddate1;

    //每页多少条数据

    private  int pageSize;

    //第几页 默认为第一页

    private  int currentPage;

    //第几页共几条数据

    private  int start;
}
