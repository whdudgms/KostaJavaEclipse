package com.kosta.exam;

public class D18MethodMaxArray {
	//정수형 배열을 매개변수로 전달받아 가장 큰 값을 찾아서 출력하는 메서드를 정의합니다.
	public static void searchMAx(int[] a) {
		int max;
		max = a[0];
		
		for(int i = 1; i < a.length; i++) {
			if(max<a[i]) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
	
	
	public static void main(String[] args) {
		int[] a= {1,2,34,5,7,8,23};
		searchMAx(a);
	}
}
