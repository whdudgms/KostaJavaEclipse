package com.kosta.exam02;


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
	public static void main(String[ ] args) {
		Person p1 = new Person("감자1");
		Person p2 = new Person("감자2");
		Person p3 = new Person("감자3");
		
		p1.setPriority(Thread.MAX_PRIORITY);
		p2.setPriority(Thread.NORM_PRIORITY);
		p3.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println();
		p1.start();
		p2.start();
		p3.start();
	}
}
