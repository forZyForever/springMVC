package com.Capcom.service.impl;

import com.Capcom.dao.AccountDao;
import com.Capcom.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class AccountServiceimpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public void transTo(Map<String, Object> map) {
        Map<String, Object> map1 = new HashMap<>();
        map1.put("name", map.get("jack"));
        /*字符串转换为double类型*/
        map1.put("money", -Double.parseDouble((String) map.get("money")));
        accountDao.updateAccount(map1);
        //出现异常
        int num=10/0;
        Map<String,Object> map2=new HashMap<>();
        map2.put("name",map.get("rose"));
        map2.put("money",Double.parseDouble((String)map.get("money")));
        accountDao.updateAccount(map2);
    }
}
