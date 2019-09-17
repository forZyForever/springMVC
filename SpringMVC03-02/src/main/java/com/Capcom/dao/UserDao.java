package com.Capcom.dao;

import com.Capcom.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

public interface UserDao {
    @Insert("insert into user values (#{id},#{username},#{password},#{nickname})")
    void register(User user);
    @Select("select * from user where username=#{username} and password=#{password}")
    User login(Map<String, Object> map);
}
