package com.itheima.service;

import com.itheima.dao.TenderProjectInfoDao;
import com.itheima.pojo.JzyPage;
import com.itheima.pojo.TenderProjectInfo;
import com.itheima.util.MoneyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TenderProjectInfoService {
    @Autowired
    TenderProjectInfoDao dao;
    @Autowired
    MoneyUtil moneyUtil;

    public Map<String,Object> selectAll(JzyPage page) {
        Integer integer = dao.selectCount(page);
        //System.out.println(integer);
        Map<String,Object> map= new HashMap<String, Object>();
        map.put("tender",dao.selectAll(page));
        map.put("count",integer);
        return map;
    }

    public TenderProjectInfo selectByid(int id){
        TenderProjectInfo info = dao.selectByid(id);
        double aDouble = Double.parseDouble(info.getPretenderamount());
        String s = moneyUtil.amountToChinese(aDouble);
        info.setPretenderamounts(s);
        return info;
    }


}
