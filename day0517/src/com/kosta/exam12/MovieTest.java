package com.kosta.exam12;

class Movie{
	private String title;
	private String director;
	private String company;
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
		//  기본생성자는 자동으로 만들어준다.
		System.out.println(m1.getTitle());
		System.out.println(m1.getDirector());
		System.out.println(m1.getCompany());
	}
}