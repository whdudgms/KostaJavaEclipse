package com.kosta.exam02;

import com.kosta.exam03.A;

public class B extends A{
	private String data;
	public void info() {
		System.out.println(title +"," + year+","+data);
	
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}
