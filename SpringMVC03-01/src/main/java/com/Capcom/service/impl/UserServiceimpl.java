package com.Capcom.service.impl;

import com.Capcom.dao.UserDao;
import com.Capcom.domain.User;
import com.Capcom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User checkUserByUsername(String username) {
      return   userDao.checkUserByUsername(username);
    }
}
