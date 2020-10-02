package com.itheima.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itheima.dao.LoginUserDao;
import com.itheima.pojo.LoginUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: engineerings
 * @author: wenlong
 * @create: 2020-09-30 11:02
 */
@Service
public class LoginUserService {
    @Autowired
    LoginUserDao loginUserDao;

    public List<LoginUsers> readLoginUsers(){
        return loginUserDao.selectList(null);
    }

    public LoginUsers selectOneName(String username){
            QueryWrapper<LoginUsers> queryWrapper=new QueryWrapper<>();
            queryWrapper.eq("username",username);
            return loginUserDao.selectOne(queryWrapper);
    }

}
