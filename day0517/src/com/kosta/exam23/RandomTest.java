package com.kosta.exam23;

public class RandomTest {
	public static void main(String[] args) {
		
		//0.0 <= result < 1
		for(int j = 0; j < 10; j++) {
			for(int i = 0; i < 10; i++) {
				double data = Math.random();
				System.out.printf("%d \t",(int)(data * 10)+1);
			}
			System.out.println();
		}
	}
}
