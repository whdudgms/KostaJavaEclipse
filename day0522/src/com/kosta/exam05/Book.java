package com.kosta.exam05;
import java.util.Objects;
abstract public class Book {
	protected String number; // 도서 관리 번호 
	protected String title;  // 제목 
	protected String author; // 저자  
	public Book() {
		super();
	}
	public abstract int getLateFees(int days); 
	public Book(String number, String title, String author) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
	}
	@Override
	public int hashCode() {
		return Objects.hash(number,title,author);
	}
	@Override
	public boolean equals(Object obj) {
		boolean re = false;
		Book b = (Book)obj;
		if(number.equals(b.number)) {
			re = true;
		}
		return re;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
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
}
