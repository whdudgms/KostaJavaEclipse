package com.kosta.exam06;

public class Magazine extends Book {
	
	String distr;

	public Magazine(String title, int pageNum, String author, String distr) {
		super(title, pageNum, author);
		this.distr = distr;
	}

	public Magazine() {
		super();
	}

	@Override
	public String toString() {
		return "Magazine [distr=" + distr + ", title=" + title + ", pageNum=" + pageNum + ", author=" + author + "]";
	}

}
