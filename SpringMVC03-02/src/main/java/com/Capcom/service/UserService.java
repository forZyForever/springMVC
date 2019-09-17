package com.Capcom.service;

import com.Capcom.domain.User;

import java.util.Map;

public interface UserService {
    void register(User user);

    User login(Map<String, Object> map);
}
