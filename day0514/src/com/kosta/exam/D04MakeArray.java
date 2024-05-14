package com.kosta.exam;

import java.util.Scanner;

public class D04MakeArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("배열의 크기를 알려주세요!");
		int n = sc.nextInt();
		
		int[] nnn = new int[n];
		
		System.out.println(nnn.length);
	}
}
