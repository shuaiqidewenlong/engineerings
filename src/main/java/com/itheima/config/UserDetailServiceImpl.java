package com.itheima.config;

import com.itheima.dao.LoginUserDao;
import com.itheima.pojo.LoginUsers;
import com.itheima.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

/**
 * @program: engineerings
 * @author: wenlong
 * @create: 2020-10-02 12:58
 */
@Configuration
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    LoginUserService loginUserService;
    @Autowired
    LoginUserDao loginUserDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(username);
        LoginUsers loginUsers = loginUserService.selectOneName(username);
        System.out.println(loginUsers);
        if (loginUsers==null){
            System.out.println("未查询");
            return  null;
        }
        //根据id查询用户权限
        List<String> pnameList= loginUserDao.readUserPname(loginUsers.getUid());
        System.out.println(pnameList);
        //集合转数据
        String[] pname = pnameList.toArray(new String[pnameList.size()]);
        UserDetails build = User.withUsername(loginUsers.getUsername()).password(loginUsers.getUpassword()).authorities(pname).build();
        return build;
    }
}
