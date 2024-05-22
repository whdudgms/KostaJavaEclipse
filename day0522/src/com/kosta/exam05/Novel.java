package com.kosta.exam05;

public class Novel extends Book{
	private final int OVER = 300;

	@Override
	public int getLateFees(int days) {
		return days * OVER;
	}

	public Novel() {
		super();
	}

	public Novel(String number, String title, String author) {
		super(number, title, author);
	}
	
}