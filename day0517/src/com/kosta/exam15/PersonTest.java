package com.kosta.exam15;

class Person{
	private String name;
	private int age;
	private double height;
	
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public Person() {
	}
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
		// 사용자가 생성자를 만들기 시작하면 더 이상 기본생성자를 제공하지 않아요.
		// 필요하다면 사용자가 만들어서 사용해야 합니다.
		Person p1 = new Person("name", 23, 56.4);
		System.out.println(p1.getName()+",  "+p1.getAge()+",  "+p1.getHeight());
		Person p2 = new Person();
		System.out.println(p2.getName()+",  "+p2.getAge()+",  "+p2.getHeight());
	}
}
