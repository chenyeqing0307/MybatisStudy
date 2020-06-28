package com.qing.mapper;

import com.qing.pojo.User;

import java.util.List;

public interface UserMapper {
    User getUserById(int id);

    List<User> getUserList(String value);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
