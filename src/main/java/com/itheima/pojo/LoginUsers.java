package com.itheima.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @program: engineerings
 * @author: wenlong
 * @create: 2020-09-30 11:00
 */
@Data
@TableName(value = "loginusers")
public class LoginUsers {
    @TableId(value = "uid",type = IdType.AUTO)
    private  int uid;
    private  String username;
    private  String upassword;
}
