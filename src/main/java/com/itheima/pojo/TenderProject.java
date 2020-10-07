package com.itheima.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class TenderProject {
    @TableField(value = "project_type")
    private int projecttype;
    @TableField(value = "project_pname")
    private String projectpname;
}
