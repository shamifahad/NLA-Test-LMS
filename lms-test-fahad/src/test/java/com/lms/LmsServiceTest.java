package com.lms;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;

import com.lms.dao.BookRepository;
import com.lms.model.Book;
import com.lms.service.LmsService;

@RunWith(MockitoJUnitRunner.class)
public class LmsServiceTest {

	ExpectedException expected = ExpectedException.none();
	
	@Mock
	LmsService service;
	
	@InjectMocks
	BookRepository bookRepository = mock(BookRepository.class);
	
	List<Book> expectedBooks = null; 
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		expectedBooks = new ArrayList<Book>();
		Book bookOne = new Book(1, "FirstSampleBook", "Bob John", "111-322-444");
		Book bookTwo = new Book(2, "SecondSampleBook", "Rob Smith", "777-564-021");
		expectedBooks.add(bookOne);
		expectedBooks.add(bookTwo);
		Mockito.when(bookRepository.findByMemberId(anyInt())).thenReturn(expectedBooks);
	}
	
	@Test
	public void testGetBookListByMemberId() {
		int memberId = 1;
		List<Book> actualBooks = service.getBookListByMemberId(memberId);
		Assert.assertEquals(expectedBooks, actualBooks);
	}
	
	
}
