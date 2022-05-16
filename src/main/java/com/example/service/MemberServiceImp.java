package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.model.MemberAccountJPA;
import com.example.repository.MemberRepository;

@Service
public class MemberServiceImp implements MemberService {

	@Autowired(required=false)
	private MemberRepository memberRepository;
	
	@Override
	public List<MemberAccountJPA> findAll() {
		System.out.println("findAll");
		return memberRepository.findAll();
	}

	@Override
	public List<MemberAccountJPA> findByEmail(String email) {
		return null;
	}

	@Override
	public List<MemberAccountJPA> findCheckMemberAccount(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
