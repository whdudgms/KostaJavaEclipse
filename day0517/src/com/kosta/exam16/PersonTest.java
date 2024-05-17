package com.kosta.exam16;

class Person{
	private String name;
	private int age;
	private double height;
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	public Person() {
		super();
	}
	public Person(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
}

public class PersonTest {	
	public static void main(String[] args) {
		// 사용자가 생성자를 만들기 시작하면 더 이상 기본생성자를 제공하지 않아요.
		// 필요하다면 사용자가 만들어서 사용해야 합니다.
		Person p1 = new Person();
		System.out.println(p1.getName()+",  "
				+p1.getAge()+",  "+p1.getHeight());
		
		System.out.println(p1);
	}
}
