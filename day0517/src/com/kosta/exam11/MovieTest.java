package com.kosta.exam11;

class Movie{
	private String title;
	private String director;
	private String company;
	
	public Movie(String title, String director, String company) {
		this.title = title;
		this.director = director;
		this.company = company;
	}
	
	public Movie() {
		// 다른 생성자를 요구하는 this()는 생성자의 첫번째 문장에 와야합니다.
		System.out.println("매개변수를 갖지 않는 생성자 동작");
		//this("제목없음","감독없음","제작사 없음");
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDirector(String director) {
		this.director =director;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDirector() {
		return director;
	}
	public String getCompany() {
		return company;
	}
	
}

public class MovieTest {
	public static void main(String[] args) {
		
		Movie m1 = new Movie();
		Movie m2 = new Movie("재미있는 자바","임유나","코스타 픽쳐스");
		System.out.println(m1.getTitle() + ", "+m1.getDirector()+", "+m1.getTitle());
		System.out.println(m2.getTitle() + ", "+m2.getDirector()+", "+m2.getTitle());
	}
}
