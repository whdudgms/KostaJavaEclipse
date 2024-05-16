package com.kosta.exam;

public class D02SortArray {
	public static void main(String[] args) {
		int[] a = {17,16,15,7,9,11};
		
		for(int i = 0;i < a.length -1;i++) {
			for(int j =i+1;j < a.length;j++) {
				if(a[j] < a[i]) {
					int temp  = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("**** 이번주 추천번호 ****");
		for(int i = 0 ; i < a.length; i++) {
			System.out.printf("%6d", a[i]);
		}
	}
}
