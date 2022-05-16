package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.dao.MemberDao;
import com.example.model.MemberAccount;
import com.example.model.MemberAccountJPA;

public interface MemberService {
//	@Autowired
//	MemberDao memberDao;
//
//	public void addMember(MemberAccount memberAccount) {
//		memberDao.addMember(memberAccount);
//	}
	
	List<MemberAccountJPA> findAll();

	List<MemberAccountJPA> findByEmail(String email);
	
	@Query(value = "select id,email,password,address,cellphone from memberaccountjpa where EMAIL = ?1 ", nativeQuery = true)
	List<MemberAccountJPA> findCheckMemberAccount(String email, String password);
}
