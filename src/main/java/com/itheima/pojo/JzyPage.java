package com.itheima.pojo;

import lombok.Data;

@Data
public class JzyPage {
    private Integer pagesize;
    private Integer state;
    private String projectname;
    private String buildcompany;
    private String creator;
    private String bidder;
    private String ids;
    private String pretenderdate;
    private String enddate;
    private String approvestatus;
}
