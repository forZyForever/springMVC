package com.Capcom.service.impl;

import com.Capcom.dao.UserDao;
import com.Capcom.domain.User;
import com.Capcom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void register(User user) {
        userDao.register(user);
    }

    @Override
    public User login(Map<String, Object> map) {
       return   userDao.login(map);
    }
}
