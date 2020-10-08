package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.pojo.JzyPage;
import com.itheima.pojo.TenderProjectInfo;

import java.util.List;

public interface TenderProjectInfoDao extends BaseMapper<TenderProjectInfo> {
    List<TenderProjectInfo> selectAll(JzyPage page);

    TenderProjectInfo selectByid(int id);

    int selectCount(JzyPage page);
}
