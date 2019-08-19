package com.example.demo.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.SysUser;

@Repository
public interface SysUserMapper {
	//获取用户数据列表
	public List<SysUser> findList(SysUser sysUser);
	//返回用户列表总数
	public int userCount();
}
