package com.itheima.dao;

import com.itheima.pojo.ZwlSubcontract;
import com.itheima.pojo.ZwlSubcontractPage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: engineerings
 * @author: wenlong
 * @create: 2020-10-03 16:44
 */
@Mapper
@Repository
public interface ZwlSubcontractDao {

    List<ZwlSubcontract> readSubcontractAll(ZwlSubcontractPage zwlSubcontractPage);

    /**
     * @return
     * 查询分包合同多少条数据
     */
    @Select("select count(1) from labor_subcontract,project where \n" +
            "labor_subcontract. pid = project.pid")
    long readSubcontractCount();

    @Select("select * from labor_subcontract,project\n" +
            "where labor_subcontract.pid = project.pid\n" +
            "and id=#{value}")
    ZwlSubcontract readSubcontractOne(int id);
}
