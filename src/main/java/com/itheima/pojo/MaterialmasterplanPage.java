package com.itheima.pojo;


import lombok.Data;

@Data
public class MaterialmasterplanPage {

        //当前页
    private  Integer currentPage;
        //每页显示多少
    private  Integer pageSize;
        //开始
    private  Integer start;
        //状态
    private  int approvestatus;
}
