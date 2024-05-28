package com.kosta.exam01;

public class ExceptionTest {
	
	
	public static void Calc(int a, int b)   {
		
		throw new RuntimeException(); 
		
	}
	
	public static void main(String[] args) {
		
		
		try {
			Calc(1,2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("hello");
		}
	}

}
