package com.kosta.exam;

public class D19MethodAddReturn {

	// 두개의 정수를 매개변수로 전달받아 더하기 한 결과를 반환하는 메소드를 정의 
	
	public static int getSum(int a, int b) {
		int add;
		add = a + b;
		return add;
	}
	public static void main(String[] args) {
		System.out.println(getSum(221,8));
	}
}
