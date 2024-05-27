package com.kosta.exam01;

import java.util.Scanner;

public class CheckEmail {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String pattern = "[a-zA-z0-9]+@[a-zA-z0-9]+\\ .[a-zA-z0-9]+";

		System.out.println("이메일을 입력하세요");
		String email = sc.next();;
		
		if(email.matches(pattern)) {
			System.out.println("표현식이 일치");
		}
			
	}
}
