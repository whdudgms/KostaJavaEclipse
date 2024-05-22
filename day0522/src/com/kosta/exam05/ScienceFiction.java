package com.kosta.exam05;

public class ScienceFiction extends Book{
	private final int OVER = 600;
	
	@Override
	public int getLateFees(int days) {
		return days * OVER;
	}

	public ScienceFiction() {
		super();
	}

	public ScienceFiction(String number, String title, String author) {
		super(number, title, author);
	}

	
}
