package com.lms.model;

import java.util.List;

public class AjaxResponseBody {
	private String status;
	private List<Book> bookList;

	public AjaxResponseBody() {
		super();
	}

	public AjaxResponseBody(String status, List<Book> bookList) {
		super();
		this.status = status;
		this.bookList = bookList;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> result) {
		this.bookList = result;
	}

}
