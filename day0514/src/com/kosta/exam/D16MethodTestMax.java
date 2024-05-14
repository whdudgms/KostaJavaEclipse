package com.kosta.exam;

public class D16MethodTestMax {
	//두개의 실수를 매개변수로 전달받아 그중에 큰 수를 찾아 출력하는 
	//메서드를  정의하고 호출해 봅니다.
	
	public static void searchMax(double a, double b) {
		if(a >= b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}
	
	public static void main(String[] args) {
		searchMax(2.5, 6.8);
		searchMax(9.5, 6.8);
		searchMax(6.5, 6.5);
	}

}
