package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ResultData;
import com.example.demo.entity.SysUser;

import com.example.demo.service.UserLoginService;

@RestController
@CrossOrigin
public class UserLoginController {
	
	@Autowired
	private UserLoginService loginService;

	@PostMapping("/login")
	public ResultData login(SysUser sysUser) {
		System.out.println(sysUser.getUsername());
		System.out.println(sysUser.getPassword());
		ResultData resultData = new ResultData();
		SysUser resultUser = loginService.login(sysUser);
		if(resultUser == null) {
			resultData.setStatus("400");
			resultData.setMsg("用户名或密码错误");
			return resultData;
		}
		resultData.setStatus("200");
		resultData.setData(resultUser);
		resultData.setMsg("登录成功");
		return resultData;
	}
}
