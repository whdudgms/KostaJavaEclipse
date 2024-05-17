package com.kosta.exam25;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동",23);
		String data = p1.getInfo();
		System.out.println(data);
		System.out.println(p1.getInfo());

	}
}
