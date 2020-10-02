package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.pojo.LoginUsers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: engineerings
 * @author: wenlong
 * @create: 2020-09-30 11:01
 */
@Mapper
@Repository
public interface LoginUserDao extends BaseMapper<LoginUsers> {
    /**
     * @return
     * 查询用户权限
     */
    @Select("select pname from loginusers,user_power,user_role,user_role_power\n" +
            "WHERE loginusers.rid=user_role.rid and user_role.rid=user_role_power.rid\n" +
            "and user_power.pid=user_role_power.pid AND uid=#{value}")
    public List<String> readUserPname(int uid);
}
