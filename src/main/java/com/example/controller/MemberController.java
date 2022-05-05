package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.MemberAccountJPA;
import com.example.service.MemberRepository;
import com.example.service.UserService;

//@Controller
@RestController
//@Component
//@ComponentScan("com.example")
public class MemberController {
	// Day12-Spring Boot-什麼是Spring Data JPA 
	@Autowired
	MemberRepository memberRepository;
	
	@Autowired
	UserService userService;
	
	
	
//	@Autowired
//	DataSource dataSource;
//	 
//	@GetMapping("/login")
//    public String login(@ModelAttribute MemberAccountJPA memberAccountJPA){
//
//        return "login";
//    }
	
//	@PostMapping("/doLogin")
//    public String doLogin(@ModelAttribute MemberAccountJPA memberAccountJPA){
//		System.out.println(memberRepository.findCheckMemberAccount(memberAccountJPA.getEmail(), memberAccountJPA.getPassword()));
//
//        return "welcome";
//    }
	
	
	// 透過 @RequestMapping 指定從/會被對應到此hello()方法
//	@Autowired
//	MemberAccount memberAccount;
//
//	@Autowired
//	MemberService memberService;
//
//	@RequestMapping("/insertMember")
//	@ResponseBody
//	public String insertMember() {
//		memberAccount = new MemberAccount();
//		memberAccount.setPassword("12345678");
//		memberAccount.setEmail("test@gmail.com");
//		memberAccount.setCellphone("0912345789");
//		memberAccount.setAddress("台北市");
//		memberService.addMember(memberAccount);
//		return "新增會員成功";
//	}
//
//	@GetMapping("/addMemberPage")
////	@RequestMapping (method = RequestMethod.GET)
////	@RequestMapping("/addMemberPage")
//	public String addMemberPage() {
//		return "addMemberPage";
//	}
//	
////	@GetMapping("/inputTest")
//	@RequestMapping("/inputTest")
//	public String InputTest(Map<String, Object> model) {
//		model.put("cust","abcd");
//		model.put("pass","efgh");
//		System.out.println("YAYAYA");
//		return "inputTest";
//	}
	
//	@GetMapping("/addMemberPage")
//    public String addMemberPage(){

//		List<MemberAccountJPA> memberAccountJPA= new ArrayList<MemberAccountJPA>();
//		memberAccountJPA = memberRepository.findAll();
//
//		for(int i=0;i<memberAccountJPA.size();i++){
//			System.out.println(memberAccountJPA.get(i).getId());
//		}
//        return "addMemberPage";
//    }
	
}