package com.kosta.exam06;

public class Book {
	String title;
	int pageNum;
	String author;
	
	public Book(String title, int pageNum, String author) {
		super();
		this.title = title;
		this.pageNum = pageNum;
		this.author = author;
	}
	public Book() {
		super();
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", pageNum=" + pageNum + ", author=" + author + "]";
	}
	
	
	
	
	
	
}
