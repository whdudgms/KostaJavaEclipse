package com.kosta.exam;

public class D26MatrixTest {
	
	public static void toStringArr(int[][] a) {
		for(int[] arr :a) {
			for(int intt :arr) {
				System.out.printf("%6d",intt);
			}
			System.out.println();
		}
	}
	
	public static void printArray(int[][] arr) {
		for(int[] row : arr) {
			for(int data: row) {
				System.out.printf("%5d",data);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
	
		int[][] b= {
				{1,2,3},
				{1,23,6,4},
				{40,50,60},
				{80,70133,23434}
				};
		
		int[][] c= {
				{1,2,3},
				{1,2,3,5},
				{3,3}
		};
		
		toStringArr(b);
		System.out.println();
		System.out.println();

		toStringArr(c);
		
		int[][][] k = {b,c};
																							
	}
}
