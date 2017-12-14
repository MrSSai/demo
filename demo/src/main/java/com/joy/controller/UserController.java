package com.joy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.joy.model.User;
import com.joy.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	@RequestMapping("/userlist")
	public List<User> queryList(){
		PageHelper.startPage(1, 2);
		return userServiceImpl.queryList();
	}


    @RequestMapping("/queryUser")
    public User queryUser(long userId){
        User user = userServiceImpl.findById(userId);
        return user;
    }

    @RequestMapping("/insert")
	public int insertUser() {
        return userServiceImpl.insertUser();
	}

    @RequestMapping("/insertParam")
    public int insertParam() {
        return userServiceImpl.insertParam();
    }

    @RequestMapping("/insertByMap")
    public int insertByMap() {
        return userServiceImpl.insertByMap();
    }

    @RequestMapping("/updateEntity")
    public int updateUser() {
        return userServiceImpl.updateUser();
    }

    @RequestMapping("/deleteEntity")
    public int deleteUser() {
        return userServiceImpl.deleteUser();
    }
}
