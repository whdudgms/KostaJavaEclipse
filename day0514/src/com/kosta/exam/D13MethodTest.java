package com.kosta.exam;

public class D13MethodTest {
	
	public static void print(String str,int n) {
		for(int i = 0; i < n; i++) {
		System.out.println(str+"야 안녕");
		}
	}

	public static void main(String[] args) {
		print("시우",2);
		String title = "KOSTA 교육센터";
		System.out.println(title);
		print("먹영",5);
		int year = 2024;
		System.out.println(year);
		print("감자",7);
	}
}
