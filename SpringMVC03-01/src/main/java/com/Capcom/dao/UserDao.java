package com.Capcom.dao;

import com.Capcom.domain.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from user where username=#{username}")
    User checkUserByUsername(String username);
}
