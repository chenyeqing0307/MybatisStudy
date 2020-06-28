package com.qing.mapper;

import com.qing.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUserAll();
    User selectUserById(int id);
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(int i);
}
