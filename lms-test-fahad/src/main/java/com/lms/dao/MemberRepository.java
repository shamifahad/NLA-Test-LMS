package com.lms.dao;

import org.springframework.data.repository.CrudRepository;

import com.lms.model.Member;

public interface MemberRepository extends CrudRepository<Member, Integer>{

}
