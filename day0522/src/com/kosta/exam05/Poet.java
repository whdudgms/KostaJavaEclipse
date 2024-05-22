package com.kosta.exam05;

public class Poet extends Book{
	private final int OVER = 200;


	@Override
	public int getLateFees(int days) {
		// TODO Auto-generated method stub
		return OVER * days;
	}


	public Poet() {
		super();
	}


	public Poet(String number, String title, String author) {
		super(number, title, author);
	}

	
}
