package com.itheima.engineering;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class EngineeringApplicationTests {
    @Autowired
    PasswordEncoder passwordEncoder;

    @Test
    void contextLoads() {
        //加密一下
        String encode = passwordEncoder.encode("123456");
        System.out.println(encode);
    }

}
