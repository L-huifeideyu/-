package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SysUser;
import com.example.demo.mapper.SysUserMapper;

@Service
public class SysUserService {
	@Autowired
	private SysUserMapper sysUserMapper;
	
	
	/**
	 * 获取用户数据列表
	 * */
	public List<SysUser> findList(SysUser sysUser){
		return sysUserMapper.findList(sysUser);
	}
	/**
	 * 获取用户总数
	 * */
	public int userCount() {
		return sysUserMapper.userCount();
	}
}
