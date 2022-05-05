package com.example.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * http://localhost:8080/put?name=A&title=B
 * @author Macro
 *
 */
@Controller
public class ControllerHandle {
	@RequestMapping("/greeting")
	@ResponseBody
	public String greeting(
			@RequestParam(value = "name", required = false, defaultValue = "defaultValue") String title,
			Model model) {
		model.addAttribute("name", title);
		return "ControllerHandle";
	}
	
	//http://localhost:8080/put?name=ABCD
	@RequestMapping("/put")
	public String put(@RequestParam(value = "name", required = false, defaultValue = "defaultValue") String title,
			Map<String, Object> model) {
		model.put("name", title);
		return "index";
	}

	private String message = "ControllerHandle 加油!!!";

	@RequestMapping("/happy")
	public String index(Map<String, Object> model) {
		model.put("name", this.message);
		return "index";
	}
	
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
}
