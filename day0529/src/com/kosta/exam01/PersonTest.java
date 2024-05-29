package com.kosta.exam01;

public class PersonTest {
	public static void main(String[] args)  {
		Person kim = new Person("김유신");
		Person lee = new Person("이순신");
		try {
			kim.sayHello();
			lee.sayHello();
		}catch (InterruptedException e) {
			System.out.println("");
			e.printStackTrace();
		}
	}
}
