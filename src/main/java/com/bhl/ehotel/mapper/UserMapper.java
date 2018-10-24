package com.bhl.ehotel.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bhl.ehotel.model.User;

@Mapper
public interface UserMapper {
	
	@Select("select * from user")
	public List<User> findAllUsers();
	
}