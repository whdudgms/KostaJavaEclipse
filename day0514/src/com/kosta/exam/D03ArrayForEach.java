package com.kosta.exam;

public class D03ArrayForEach {
	public static void main(String[] args) {
		int []numbers =new int[5];
		
		for(int i = 0; i < 5; i++) {
			numbers[i] = i+1;
		}
		
		for(int i : numbers) {
			System.out.print("i"+ i + "-->");
		}
		
		
	}

}
