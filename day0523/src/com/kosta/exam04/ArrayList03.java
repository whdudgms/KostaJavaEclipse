package com.kosta.exam04;

import java.util.ArrayList;

class Human{
	String name;
	int age;
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Human() {
		super();
	}
	public void sayHello() {
		System.out.println("Hello, " +name);
	}
	
	
}

public class ArrayList03 {
	public static void main(String[] args) {
		
		ArrayList<Human> list = new ArrayList<Human>();
		list.add(new Human("홍길동",20));
		list.add(new Human("홍석영",21));
		list.add(new Human("임유나",22));
		list.add(new Human("홍사사",22));
			
		for (Human h : list) {
			h.sayHello();
		}
		
	}
}
