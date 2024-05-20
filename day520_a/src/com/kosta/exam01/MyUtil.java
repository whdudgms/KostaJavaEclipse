package com.kosta.exam01;

public class MyUtil {	
// 2개의 정수를 매개변수로 전달받아 그 중에 큰 수를 찾아서 반환하는 메소드를 정의 
//	public int getMax(int a, int b) {
//		int max = a > b? a : b;
//		return max;
//	}
	
	// 두 개의 실수를 매개변수로 전달받아 그중에 큰 수를 찾아서 반환하는 메소드를 정의 
	public double getMax(double a, double b) {
		double max = a > b ?  a : b;
		return max;
	}
	
	public double getMax(double[] a) {
		double max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

}
