package com.kosta.exam01;

public class Person {
	private String name;
	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void sayHello() throws InterruptedException {
		for(int i = 1; i <= 10; i++) {
			System.out.println("hello, "+name + ", " +i);
			new Thread().sleep(100);;

		}
	}
	
}
