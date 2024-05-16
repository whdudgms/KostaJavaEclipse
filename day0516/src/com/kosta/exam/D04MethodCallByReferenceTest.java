package com.kosta.exam;

import java.util.Arrays;

public class D04MethodCallByReferenceTest {
	// 정수형 배열을 매개변수로 전달받아 배열의 요소를 모두 1씩 증가하는 메소드 
	public static void plusIrr(int[] a) {
		for(int i = 0; i < a.length; i++) {
			a[i]++;
		}
		System.out.println("메서드 내부에서의 정수배열"+Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		int[] ir = {1,2,3};
		plusIrr(ir);
		System.out.println("메서드 호출 후 정수배열"+Arrays.toString(ir));
	}
}
