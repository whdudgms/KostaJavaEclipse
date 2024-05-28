package com.kosta.exam01;

public class Calc04 {
	public static void main(String[] args) {
		try {
		throw new ArithmeticException();
		}catch(ArithmeticException e) {
			System.out.println("예외");
		}catch(Exception a) {
			System.out.println("예외1");
		}finally {
			System.out.println("finally2");
		}
	}
}
