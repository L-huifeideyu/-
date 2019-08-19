package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PageList;
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
	public ResultData GetUser(SysUser sysUser) {
		ResultData resultData = new ResultData();
		int currentIndex = sysUser.getCurrentIndex();
		sysUser.setCurrentIndex(currentIndex-1);
		List<SysUser> userList = userService.findList(sysUser);
		int total = userService.userCount();
		PageList pageList = new PageList();
		pageList.setTotal(total);
		pageList.setList(userList);
		pageList.setCurrentIndex(sysUser.getCurrentIndex());
		pageList.setPageSize(sysUser.getPageSize());
		resultData.setStatus("100");
		resultData.setData(pageList);
		resultData.setMsg("ok");
		// List<SysUser> list = userService.Sel(id);
		return resultData;
	}

}
