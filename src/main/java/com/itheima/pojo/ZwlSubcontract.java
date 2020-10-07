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
    private int  p_id;
    private String contract_name;
    private String contract_type;
    private String contract_signatory;
    private String start_date;
    private String end_date;
    private long  contract_amount;
    private String amount_upper;
    private String payment_type;
    private String settle_type;
    private long advance_pay;
    private long deposit_amount;
    private int flow_id;
    private String approve_status;
    private String pay_condition;
    private String main_term;
    private String comment;
    private String attach_ids;
    private String create_date;
    private int labor_org_id;
}
