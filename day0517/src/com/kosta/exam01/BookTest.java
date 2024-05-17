package com.kosta.exam01;

class Book{
	private String title;
	private String author;
	
	void setTitle(String t){
		this.title = t;
	}
	String getTitle(){
		return this.title;
	}
	void setAuthor(String a) {
		this.author = a;
	}
	String getAuthor() {
		return this.author;
	}
}

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		
	}

}
