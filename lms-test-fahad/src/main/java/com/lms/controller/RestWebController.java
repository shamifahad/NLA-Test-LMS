package com.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.model.AjaxResponseBody;
import com.lms.model.Book;
import com.lms.model.Member;
import com.lms.service.LmsService;

/**
 * @author zumair 
 * This controller has been created for Ajax request processing
 */
@RestController
public class RestWebController {

	@Autowired
	LmsService service;

	@PostMapping("/getRecord")
	public AjaxResponseBody getBookList(@RequestBody Member member) {
		AjaxResponseBody response = new AjaxResponseBody();
		List<Book> books = service.getBookListByMemberId(member.getId());
		if (books != null && books.size() > 0) {
			response.setStatus("Done");
			response.setBookList(books);
		} else {
			response.setStatus("Member has no borrowed books");
		}
		return response;
	}

}
