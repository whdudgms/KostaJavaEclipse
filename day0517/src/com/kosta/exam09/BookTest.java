
package com.kosta.exam09;

class Book{
	private String title;
	private String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	Book(String title){
		this(title,"저자없음");
	}
	
	Book(){
		this("제목없음","저자없음");
	}
	
	public void setTitle(String t){
		this.title = t;
	}
	public String getTitle(){
		return this.title;
	}
	public void setAuthor(String a) {
		this.author = a;
	}
	public String getAuthor() {
		return this.author;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	
}

public class BookTest {

	public static void main(String[] args) {
		
		Book b1 = new Book("재미있는 자바", "임유나");
		Book b2 = new Book();
		Book b3 = new Book("신나는 자바");
		
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());

		System.out.println(b1.getTitle() + ", " + b1.getAuthor());
	}
}

