package com.itheima.engineering;

import com.itheima.util.MoneyUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class EngineeringApplicationTests {
    @Autowired
    PasswordEncoder passwordEncoder;


    @Test
    void contextLoads() {

        //加密一下
//        String encode = passwordEncoder.encode("123456");
//        System.out.println(encode);
//        String ss="1312321321";
//        String substring = ss.substring(0, 5);
//        System.out.println(substring);

//        String ss="2020-09-30T16:00:00.000Z";
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            sdf.parse(ss);
//        }catch (Exception e){
//            System.out.println(1111);
//        }


    }

}
