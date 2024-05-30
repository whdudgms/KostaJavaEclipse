package com.kosta.exam01;


class Person extends Thread{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("hello");
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person("감자");
		
		p.start();
	}
}
