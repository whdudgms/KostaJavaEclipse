package com.kosta.exam;

public class D03MethodCallByValueTest {

	//정수형 변수 하나를 매개변수로 전달받아 1을 증가하여 출력하는 메소드를
	//정의하시오.
	
	// 값에 의한 호출! 
	public static void add(int n) {
		n = n + 1;
		System.out.println("n :" + n);
	}
	
	public static void main(String[] args) {
		int a; 
		a = 5;
		add(a);
		System.out.println("메소드를 호출한 뒤 : a :" +a );
	}
}
