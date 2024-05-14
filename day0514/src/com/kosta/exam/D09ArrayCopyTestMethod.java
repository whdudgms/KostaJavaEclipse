package com.kosta.exam;

import java.util.Arrays;

public class D09ArrayCopyTestMethod {
	
	
	//정수형 배열을 전달받아서 배열의 요소를 모두 출력하는 메소드를 정의 
	public static void printArray(String str,int []arr){
		System.out.print(str);
		for(int data : arr) {
			System.out.printf("%5d", data);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b;
		b = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		printArray("a배열의 요소 -->",a);
		printArray("b배열의 요소 -->",b);
		a[1] = 200;
		printArray("a배열의 요소 -->",a);
		printArray("b배열의 요소 -->",b);
	}
}
