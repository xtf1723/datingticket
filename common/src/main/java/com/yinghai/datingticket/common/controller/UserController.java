package com.yinghai.datingticket.common.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yinghai.datingticket.common.model.User;
import com.yinghai.datingticket.common.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private Logger log = Logger.getLogger(this.getClass());
	@Autowired
	private UserService userService;
	@RequestMapping("/test")
	public void getUser(HttpServletRequest request,HttpServletResponse response){
		User u = userService.selectById(1);
		System.out.println("************"+u);
		log.info("哈哈哈哈哈哈哈哈哈");
	}
	
	@RequestMapping("/totest")
	public String toUser(HttpServletRequest request,HttpServletResponse response,ModelMap model){
		model.addAttribute("username", "张三");
		return "user";
	}
}
