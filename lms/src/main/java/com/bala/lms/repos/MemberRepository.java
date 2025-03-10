package com.bala.lms.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bala.lms.models.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
