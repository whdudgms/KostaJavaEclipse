package com.kosta.exam26;

public class Person {
	private String name;
	private int age;
	
	public String toString() {
		String result = "[이름: "+name +"]  나이: "+age+"]";
		return result;
	}
	
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

	public String getInfo() {
		String result = "이름: "+name +"  이름: "+age;
		return result;
	}
	
}
