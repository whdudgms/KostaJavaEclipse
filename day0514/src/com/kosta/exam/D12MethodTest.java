package com.kosta.exam;

public class D12MethodTest {
	
	public static void print(int n) {
		for(int i = 0; i < n; i++) {
		System.out.println("시우야 안녕");
		}
	}

	public static void main(String[] args) {
		print(2);
		String title = "KOSTA 교육센터";
		System.out.println(title);
		print(5);
		int year = 2024;
		System.out.println(year);
		print(7);
	}
}
