package com.itheima.service.Impl;


import com.itheima.dao.MaterialmasterplanDao;
import com.itheima.pojo.Materialmasterplan;
import com.itheima.pojo.MaterialmasterplanPage;
import com.itheima.service.MaterialmasterplanServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MaterialmasterplanServicesiml implements MaterialmasterplanServices {
    @Autowired
    MaterialmasterplanDao dao;

    @Override
    public Long countAll() {
        return dao.countAll();
    }

    @Override
    public Map<String,Object> selectAll(MaterialmasterplanPage page) {
        Map<String,Object>  map=new HashMap<>();
                //分页后的数据
        List<Materialmasterplan>  materialmasterplans=dao.selectAll(page);
                //共有多少页
        Long along=dao.countAll();
        map.put("along",along);
        map.put("materialmasterplans",materialmasterplans);

        return map;
    }
}
