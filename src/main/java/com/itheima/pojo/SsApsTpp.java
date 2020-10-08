package com.itheima.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@TableName("aps_tpp")
public class SsApsTpp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ids")
    private Integer id;
    @Column(name = "aps")
    private Integer aps;
    @Column(name = "tpp")
    private Integer tpp;
}
