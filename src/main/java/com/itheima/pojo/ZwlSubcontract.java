package com.itheima.pojo;

import lombok.Data;

/**
 * @program: engineerings
 * @author: wenlong
 * @create: 2020-10-03 16:14
 */
@Data
public class ZwlSubcontract {
    private int  id;
    private int  pid;
    private String pname;
    private String contractname;
    private String contracttype;
    private String contractsignatory;
    private String startdate;
    private String enddate;
    private long  contractamount;
    private String amountupper;
    private String paymenttype;
    private String settletype;
    private long advancepay;
    private long depositamount;
    private int flowid;
    private String approvestatus;
    private String paycondition;
    private String mainterm;
    private String comment;
    private String attachids;
    private String createdate;
    private int labororgid;
    private String subcontractorsshall;
}
