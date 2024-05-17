package com.kosta.exam13;


class Person {
	private String name;
	private int age;
	private double height;
	public Person() {}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
}

public class PersonTest {	
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.getName()+",  "+p1.getAge()+",  "+p1.getHeight());
		
	
	}
}
