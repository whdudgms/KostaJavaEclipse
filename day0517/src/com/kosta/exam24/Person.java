package com.kosta.exam24;

public class Person {
	private String name;
	private int age;
	// Person의 모든 속성정보를 출력하는 메소드를 정의
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
	}

	public void info() {
		System.out.println("이름: "+name);
		System.out.println("이름: "+age);
	}
}
