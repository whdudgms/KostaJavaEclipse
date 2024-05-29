package com.kosta.exam03;

public class personTest {
	public static void main(String[] args) {
		Person p1 = new Person("감자1");
		Person p2 = new Person("감자2");
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		
		
		t1.start();
		t2.start();
	}
}
