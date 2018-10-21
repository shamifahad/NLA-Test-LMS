package com.lms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.dao.BookRepository;
import com.lms.dao.MemberRepository;
import com.lms.model.Book;
import com.lms.model.Member;
/**
 * @author zumair
 * This class holds all the service functions
 */
@Service
public class LmsService {
	
	@Autowired
	private MemberRepository memberRepository;

	@Autowired
	private BookRepository bookRepository;
	
	public List<Member> getMemberList() {
		List<Member> members = new ArrayList<Member>();
		memberRepository.findAll().forEach(members::add);
		return members;
	}

	public List<Book> getBookList() {
		List<Book> books = new ArrayList<Book>();
		bookRepository.findAll().forEach(books::add);
		return books;
	}
	
	public List<Book> getBookListByMemberId(int memberId){
		List<Book> memberBooks = new ArrayList<Book>();
		if(memberId>0) {
			memberBooks = bookRepository.findByMemberId(memberId);	
		}else {
			throw new RuntimeException("Invalid Member Id");
		}
		return memberBooks;
	}
}
