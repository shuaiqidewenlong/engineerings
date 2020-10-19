package com.itheima.config;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.dao.LoginUserDao;
import com.itheima.pojo.LoginUsers;
import com.itheima.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

/**
 * User detail service
 *
 * @program: engineerings
 * @author: wenlong
 * @create: 2020 -10-02 12:58
 */
@Configuration
public class UserDetailServiceImpl implements UserDetailsService {
    /**
     * Login user service
     */
    @Autowired
    LoginUserService loginUserService;
    /**
     * Login user dao
     */
    @Autowired
    LoginUserDao loginUserDao;

    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        /*System.out.println(username);*/

       /* System.out.println(loginUsers);*/
        LoginUsers loginUsers = null;
        BoundValueOperations<String, Object> ops = redisTemplate.boundValueOps("user");
        String user = (String) redisTemplate.opsForValue().get("user");
        JSONObject jsonObject = JSONObject.parseObject(user);
        UserDetails build=null;
        //账户
        int uid = Integer.parseInt(jsonObject.getString("uid"));
        //用户名
        String uname = jsonObject.getString("username");
        // System.out.println(uname);
        //密码
        String upassword = jsonObject.getString("upassword");
        // System.out.println(upassword);

        Object o = ops.get();
        if(o == null){
            //调用dao
            loginUsers = loginUserService.selectOneName(username);
            System.out.println("从数据库获取"+loginUsers);
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                String asString = objectMapper.writeValueAsString(loginUsers);
                ops.set(asString);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("从redis当中获取值"+o);
        }

        if(o == null) {
            List<String> pnameList = loginUserDao.readUserPname(loginUsers.getUid());
            //集合转数据
            String[] pname = pnameList.toArray(new String[pnameList.size()]);
            build = User.withUsername(loginUsers.getUsername()).password(loginUsers.getUpassword()).authorities(pname).build();
        } else {

        //根据id查询用户权限
        List<String> pnameList= loginUserDao.readUserPname(uid);
       /* System.out.println(pnameList);*/
        //集合转数据
        String[] pname = pnameList.toArray(new String[pnameList.size()]);
         build = User.withUsername(uname).password(upassword).authorities(pname).build();
        }
        return build;
    }
}
