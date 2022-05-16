package com.example.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.MemberAccount;
import com.example.model.MemberAccountJPA;
import com.example.repository.MemberRepository;
import com.example.service.MemberService;
import com.example.service.UserService;

@Controller
public class MemberController {
	// Day12-Spring Boot-什麼是Spring Data JPA 
	
	@Autowired(required=false)
	MemberService memberService;
	
	@Autowired
	MemberAccount memberAccount;
	
	@GetMapping("/login")
    public String login(@ModelAttribute MemberAccountJPA memberAccountJPA){
		System.out.println("login");
        return "login";
    }
	
	@PostMapping("/doLogin")
    public String doLogin(@ModelAttribute MemberAccountJPA memberAccountJPA){
		System.out.println("doLogin");
		System.out.println("Email: " + memberAccountJPA.getEmail());
		System.out.println("Password: " + memberAccountJPA.getPassword());
//		System.out.println(memberService.findCheckMemberAccount(memberAccountJPA.getEmail(), memberAccountJPA.getPassword()));
		System.out.println(memberService.findAll());
        return "welcome";
    }
	

	

	

	
//	@Autowired
//	UserService userService;
	
	@GetMapping("/addMemberPage")
	public String addMemberPage() {
//		List<MemberAccountJPA> memberAccountJPA = new ArrayList<MemberAccountJPA>();
//		memberAccountJPA = memberRepository.findAll();
//
//		for (int i = 0; i < memberAccountJPA.size(); i++) {
//			System.out.println(memberAccountJPA.get(i).getId());
//		}
		return "addMemberPage";
	}
	
	@RequestMapping("/inputTest")
	public String InputTest(Map<String, Object> model) {
		model.put("cust","abcd");
		model.put("pass","efgh");
		System.out.println("YAYAYA");
		return "inputTest";
	}
	
    @RequestMapping("/hello")
    public String hello(){
    	memberAccount = new MemberAccount();
    	memberAccount.setPassword("20220512");
    	memberAccount.setEmail("test@gmail.com");
    	memberAccount.setCellphone("0912345789");
    	memberAccount.setAddress("台北市");
//    	memberService.addMember(memberAccount);
        return "新增會員成功";
    }
    

}