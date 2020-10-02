package com.itheima.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @program: engineerings
 * @author: wenlong
 * @create: 2020-10-02 12:58
 */
@Configuration
public class MySecurityConfigration extends WebSecurityConfigurerAdapter {
    //登录使用加密方式不然登不进去 不配置加密方式 md5
    //密码不加密设置 return NoOpPasswordEncoder.getInstance();

    @Bean
    PasswordEncoder passwordEncoder(){
        //加密密码设置
        return new BCryptPasswordEncoder();
    }


    @Override
    //认证以及授权配置
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
             //所有请求都需要验证
            .anyRequest().authenticated()
            .and()
            //允许表单提交
            .formLogin()
            //配置登录界面
            .loginPage("/login")
            //登录成功界面
            .defaultSuccessUrl("/index").permitAll();
            //关闭跨域
            http.csrf().disable();
            //如果网页出现了嵌套frame需要加一个配置
            http.headers().frameOptions().sameOrigin();
    }
    //释放资源
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().mvcMatchers("/css/**","/fonts/**","/images/**","/js/**","/lib/**");
    }
}
