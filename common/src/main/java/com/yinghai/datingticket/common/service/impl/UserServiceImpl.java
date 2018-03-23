package com.yinghai.datingticket.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.yinghai.datingticket.common.dao.UserMapper;
import com.yinghai.datingticket.common.model.User;
import com.yinghai.datingticket.common.service.UserService;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	public User selectById(Integer userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

}
