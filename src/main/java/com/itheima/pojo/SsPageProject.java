package com.itheima.pojo;

import lombok.Data;

import javax.persistence.Column;

/**
 * Ss page project
 * @author 25928
 */
@Data
public class SsPageProject {
    /**每页显示多少条*/
    private Integer pageSize;
    /**默认是第几页*/
    private Integer currentPage;
    /*开始页
    * Integer
    * */
    private Integer startPage;

//    项目名称
    private String projectName;
}
