package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;

//	@GetMapping("/")
//	public String index(Map<String, Object> model) {
//		model.put("ID", userService.getUserId());
//		return "index";
//	}
  
	private String message = "鐵人賽第七天加油!!!";

	// 版本不同所以現在只能用RM
	// @GetMapping("/")
	@RequestMapping (method = RequestMethod.GET)
	public String index(Map<String, Object> model) {
		System.out.println("進入了UserService的getUserId方法 index" + userService.getUserId());
		model.put("ID", userService.getUserId());
		return "index";
	}

}