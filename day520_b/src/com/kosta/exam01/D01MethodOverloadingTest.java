package com.kosta.exam01;


public class D01MethodOverloadingTest {
	public static void main(String[] args) {
		MyUtil my = new MyUtil();
		double[] a = {1.2, 3, 5, 665.3, 234.4, 922.1};
		System.out.println(my.getMax(a));
		System.out.println(my.getMax(23.932,23.45));
		System.out.println(my.getMax(3,232)); // int는 double로  포함됨 double 을 매개변수로 받는 메소드가 동작 가능!
		
		int[] b =  {1,2,3}; // 배열은 오류가 난다. int -> double 가능 int[] -> double[] 불가능 
	}
}


/// 형변환 ?? 안 될 것 같은데? 