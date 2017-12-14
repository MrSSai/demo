package com.joy.service;

import com.joy.model.User;

import java.util.List;

public interface UserService {

    List<User> queryList();
    User findById(long userId);
    int insertUser();
    int insertParam();
    int insertByMap();
    int updateUser();
    int deleteUser();

}
