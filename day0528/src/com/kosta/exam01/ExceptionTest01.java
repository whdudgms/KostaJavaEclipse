package com.kosta.exam01;

public class ExceptionTest01  {
	public static void calcDiv(int a, int b) {
		int r = a/b;
		System.out.println(r);
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		calcDiv(12, 3);
	}
}
