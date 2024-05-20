package com.kosta.exam06;

public class BookTest {
	public static void main(String[] args) {
		Book book = new Book("재미있는 자바",600,"임유나");
		System.out.println(book);
		
		//기본으로 자식에서 매개변수가 없는 부모 생성자 호출 
		// 근데 따로 매개변수 있는 생성자를 부모에서 만들면 자식은 없는 생생자를 호출하므로 에러 발생 
		Magazine magazine = new Magazine("재미있는 자바", 60, "임유나", "2023-01-23");
		System.out.println(magazine);
	}
}
