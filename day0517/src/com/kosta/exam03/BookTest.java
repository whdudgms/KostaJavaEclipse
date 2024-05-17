package com.kosta.exam03;

class Book{
	private String title;
	private String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
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
		
		System.out.println(b1);
		// private 영역에 접근하여 변경시키는 것 뿐 아니라
		// 읽어 오는 것도 접근할 수 없어요!
		
	}

}
