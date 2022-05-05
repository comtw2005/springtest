package com.example.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerHandle {
	// 透過 @RequestMapping 指定從/會被對應到此hello()方法
	@RequestMapping("/hello")
	public String hello() {
		return "向全世界說聲Spring Boot 很高興認識你!";
	}

//	private String message = "鐵人賽第七天加油!!!";

//	@RequestMapping("/")
//	public String index(Map<String, Object> model) {
//		model.put("name", this.message);
//		return "index";
//	}

	// http://localhost:8080/MyFirstPage?title=A
	@RequestMapping("/MyFirstPage")
	public String myFirstPage(@RequestParam(value = "title", required = false, defaultValue = "xiao") String title,
			Model model) {
		model.addAttribute("name", title);
		return "MyFirstPage";
	}
}