package com.kosta.exam;

import java.util.Arrays;

public class D25MatrixTest {

	public static void main(String[] args) {
		int[][] a = new int[3][];
		
		a[0] = new int[5];
		a[1] = new int[2];
		a[2] = new int[10];
		
		int su = 1;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = su++;
			}	
		}
		System.out.println(Arrays.deepToString(a));
		
		
		for(int[] arr: a) {
			for(int data:arr) {
				System.out.printf("%5d",data);
			}
			System.out.println();
		}
	}
}