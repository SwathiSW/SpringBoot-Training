package com.springboot_feign_client_book_producer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	private Integer bookId;
	private String bookName;
	private int bookCost;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookCost() {
		return bookCost;
	}

	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}

	public Book(Integer bookId, String bookName, int bookCost) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCost = bookCost;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookCost=" + bookCost + "]";
	}

}
