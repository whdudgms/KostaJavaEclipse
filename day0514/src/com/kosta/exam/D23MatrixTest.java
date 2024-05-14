package com.kosta.exam;

import java.util.Arrays;

public class D23MatrixTest {
	public static void main(String[] args) {
		int[][] arr= new int[4][3];
		// 아래 표처럼 만들어짐.
		/*	  0  1  2
		 * 0 [ ][ ][ ]
		 * 1 [ ][ ][ ]
		 * 2 [ ][ ][ ]
		 * 3 [ ][ ][ ]
		 * */

		int su = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = su++;
			}	
		}
		
		System.out.println(Arrays.deepToString(arr));
	}

}
