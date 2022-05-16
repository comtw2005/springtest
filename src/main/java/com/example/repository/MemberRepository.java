package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.MemberAccountJPA;

@Repository
public interface MemberRepository extends JpaRepository<MemberAccountJPA, Long> {
}