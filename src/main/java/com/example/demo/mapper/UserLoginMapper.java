package com.example.demo.mapper;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.SysUser;

@Repository
public interface UserLoginMapper {
	public SysUser login(SysUser sysUser);
}
