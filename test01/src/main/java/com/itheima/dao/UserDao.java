package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    /***
     * 查询所有
     * @return
     */
    @Select("select*from s_user")
    List<User> findAll();
    @Select("select*from s_user where username=#{username}and password=#{password}")
    int findone(User user);
}
