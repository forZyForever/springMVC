package com.Capcom.service;

import com.Capcom.domain.User;

public interface UserService {
    User checkUserByUsername(String username);
}
