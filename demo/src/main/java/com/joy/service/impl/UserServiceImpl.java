package com.joy.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.joy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joy.dao.UserMapper;
import com.joy.model.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired(required = false)
	private UserMapper mapper;
	
	public List<User> queryList(){
		List<User> userList=mapper.queryList();
		return userList;
	}

    public User findById(long userId){
        System.out.println("userId:"+userId);
        return mapper.findById(userId);
    }

	public int insertUser() {
		User user=new User();
		user.setUserName("lisi");
		user.setUserCode("lisi"+new Date());
		user.setNickName("郭靖");
        user.setUserPwd("123");
        user.setCreateDate(new Date());
        user.setUpdateDate(new Date());
        return mapper.insertUser(user);
	}

    public int insertParam() {
        return mapper.insertParam("linzhiqiang","lzq");
    }

    public int insertByMap() {
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("nickName","zhaotong");
        map.put("userCode","zt");
        return mapper.insertByMap(map);
    }

    public int updateUser() {
        User user=new User();
        user.setUserId(1);
        user.setNickName("郭靖");
        return mapper.updateUser(user);
    }

    public int deleteUser() {
        User user=new User();
        user.setUserId(11);
        return mapper.deleteUser(user);
    }
}
