package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SysUser;
import com.example.demo.mapper.UserLoginMapper;

@Service
public class UserLoginService {
	@Autowired
	private UserLoginMapper userLoginMapper;
	
	
	
	public SysUser login(SysUser sysUser) {
		
		return userLoginMapper.login(sysUser);
	}
}
