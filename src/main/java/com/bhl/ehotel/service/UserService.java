package com.bhl.ehotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhl.ehotel.mapper.UserMapper;
import com.bhl.ehotel.model.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public List<User> findAllUsers() {
		return userMapper.findAllUsers();
	}
	
}