package com.kosta.exam;

public class D21MethodGetFactorial {	
	
	//정수형 변수 n을 전달받아서 n!을 구하여 반환하는 메서드를 정의 합니다.
	public static int getFactori(int n) {
		int num =1;
		for(int i =2; i <= n; i++){ // 5, 4, 3, 2, 1
			num *= i;
		}		
		return num;
	}
	//메인 메서드 
	public static void main(String[] args){
		System.out.println(getFactori(11));
		int data =getFactori(9);
		System.out.println(data);
	}

}