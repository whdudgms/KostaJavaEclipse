package com.kosta.exam;

import java.util.Iterator;

public class D17MethodTestGugudan {
	
	//몇단을 출력할지 매개변수로 전달받아 해당하는 구구단을 출력하는 메소드를 정의합니다. 
	// ||는 숏컷오퍼레이션이다 둘중 하나만 맞으면 다음 명령은 물어보지않고 끝낸다 
	public static void makeGugudan(int a) {
		if(a < 2 || 9 < a ) {
			return;
		}
		System.out.println(a +"단을 출력합니다. " );
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d  =  %d \n"
					+ "",a,i,a*i);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		makeGugudan(60);
		makeGugudan(5);

	}
}
