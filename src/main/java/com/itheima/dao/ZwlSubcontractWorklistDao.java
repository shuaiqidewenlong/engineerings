package com.itheima.dao;

import com.itheima.pojo.ZwlSubcontractWorklist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: engineerings
 * @author: wenlong
 * @create: 2020-10-05 16:59
 */
@Repository
@Mapper
public interface ZwlSubcontractWorklistDao{
    @Select("select * FROM  subcontracworklist where laborid=#{value}")
    List<ZwlSubcontractWorklist> readSubcontractWorklist(int laborid);

    @Select("select labororgid from labor_subcontract where id=#{value}")
    int readSubcontractById(int id);
}
