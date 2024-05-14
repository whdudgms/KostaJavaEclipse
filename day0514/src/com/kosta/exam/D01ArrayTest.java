package com.kosta.exam;

import java.util.Arrays;

public class D01ArrayTest {

	public static void main(String[] args) {
		int[] data = {10,20,30,40,50};
		
		System.out.println(Arrays.toString(data));
		
		// i : 0,1,2,3,4
		for(int i = 0; i < 5; i++) {
			System.out.println(data[i]);
		}
		
		
		//foreach 구문임 
		for(int i : data) {
			System.out.println(i);

		}
	}

}
