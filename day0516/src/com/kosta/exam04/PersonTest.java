package com.kosta.exam04;

class Person{
	String name;
	String gender;
	int age;
	
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
		
		lee.name 	= "이재원";
		lee.gender 	= "남자";
		lee.age 	= 28;
		
		kim.name 	= "김예은";
		kim.gender 	= "여자";
		kim.age 	= 26;
		
		lee.eat("아이스크림");
		lee.eat("청계천");
		System.out.println();
		kim.eat("과자");
		kim.eat("종각");
	}
}
