package com.kosta.exam;

public class D15MethodTestSumArray {
	//정수형 배열을 매개변수로 전달받아 총합을 누적하여 출력하는 메소드를 정의
	public static void sumIrr(int[] ir) {
		int sum = 0;
		for(int i = 0; i < ir.length; i++) {
			sum += ir[i];
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		int[] ir= {2,5,67,7,8};
		int[] ir1= {22,25,627,72,28};
		sumIrr(ir);
		sumIrr(ir1);
	}

}
