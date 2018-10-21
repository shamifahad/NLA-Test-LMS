package com.lms.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author fahad 
 * This class holds the information about Book registered with Library
 */
@Entity
public class Book {

	@Id
	private int bookId;
	private String title;
	private String author;
	private String isbn;

	@ManyToOne
	private Member member;

	public Book() {
	}

	public Book(int bookId, String title, String author, String isbn) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public String getIsAvailable() {
		return this.getMember() == null ? "NO" : "YES";
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", member="
				+ member + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getBookId(), this.getAuthor(), this.getIsbn(), this.getTitle(), this.getMember());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(this.bookId, other.getBookId()) && Objects.equals(this.author, other.getAuthor())
				&& Objects.equals(this.isbn, other.getIsbn()) && Objects.equals(this.title, other.getTitle())
				&& Objects.equals(this.member, other.getMember());
	}

}
