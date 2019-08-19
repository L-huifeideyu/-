package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ResultData;
import com.example.demo.entity.SysUser;
import com.example.demo.service.SysUserService;

@RestController
@CrossOrigin
@RequestMapping("/sys")
public class SysUserController {
	@Autowired
	private SysUserService userService;

	// 获取用户数据列表
	@GetMapping("/userList")
	public ResultData GetUser(SysUser sysUser, String currentIndex, String pageSize) {

		ResultData resultData = new ResultData();
		List<SysUser> userList = userService.findList(sysUser);
		
		int fromIndex = Integer.parseInt(currentIndex);
		int endIndex = Integer.parseInt(pageSize);
		List<SysUser> pageList = userList.subList((fromIndex-1)*endIndex, fromIndex*endIndex);
		resultData.setStatus("100");
		resultData.setData(pageList);
		resultData.setMsg("ok");
		// List<SysUser> list = userService.Sel(id);
		return resultData;
	}

}
