package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.pojo.LoginUsers;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @program: engineerings
 * @author: wenlong
 * @create: 2020-09-30 11:01
 */
@Mapper
@Repository
public interface LoginUserDao extends BaseMapper<LoginUsers> {
}
