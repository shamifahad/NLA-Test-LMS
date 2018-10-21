package com.lms.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.lms.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

	public List<Book> findByMemberId(Integer personId);
}
