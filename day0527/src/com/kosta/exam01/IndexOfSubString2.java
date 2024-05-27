package com.kosta.exam01;

import java.util.Scanner;

// 어떤 사람의 이메일을 입력받아서 
// 아이디만 추출하여 출력하는 프로그램을 작성 해 봅니다.
//
public class IndexOfSubString2 {
	public static void main(String[] args) {
//		String email = "kim@naver.com";
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일을 입력해주세요");
		String email = sc.next();
		System.out.println(email);
		System.out.println(email.indexOf("@"));
		System.out.println(email.substring(0,email.indexOf("@")));
	}
}
