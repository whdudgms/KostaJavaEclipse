package com.kosta.exam03;

import java.util.Random;

public class RandomTest01 {
	public static void main(String[] args) {
		// 1~10사이의 난수 만들기 
		
		Random r = new Random();
		int data1 = r.nextInt(10)+1;
		System.out.println(data1);
		
		int dat2 = (int)(Math.random()*10+1);
		System.out.println(data1);

	}

}
