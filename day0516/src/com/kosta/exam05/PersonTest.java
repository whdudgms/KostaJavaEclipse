package com.kosta.exam05;

class Person{
	private String name;
	private String gender;
	private int age;
	
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat(String food) {
		System.out.printf("%s %d살 %s이(가) %s를(을) 먹음.\n", gender, age, name, food);
	}
	public void walk(String where) {
		System.out.printf("%s %d살 %s이(가) %s로 걸어감.\n", gender, age, name, where);
	}
}

public class PersonTest {
	public static void main(String[] args) {
		int data;
		Person lee = new Person();
		data = 2024;					//기본자료형은 바로 값을 저장할 수 있다. 
		lee = new Person();				//참조자료형은 객체를 생성하고 사용할 수 있다.
		Person kim = new Person();  	//참조변수를 선언하면서 바로 생성할 수 있어요.
		
		lee.setName("이재원");
		lee.setGender("남자"); 
		lee.setAge(29);
		
		kim.setName("김예은");
		kim.setGender("여자"); 
		kim.setAge(26);
		
		lee.eat("아이스크림");
		lee.walk("청계천");
		kim.eat("과자");
		kim.walk("종각");
	}
}
