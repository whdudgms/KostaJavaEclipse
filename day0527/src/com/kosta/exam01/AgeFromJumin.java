package com.kosta.exam01;

import java.util.Date;
import java.util.Scanner;

// 사용자한테 주민번호를 입력바당서
// 나이를 계산하여 출력하는 프로그래밍 작성
//
public class AgeFromJumin {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.");
		String jumin = sc.next();
	
		String jumin_year = jumin.substring(0,2);
		char jumin_gender = jumin.charAt(7);
		
		
		if(Integer.parseInt(jumin_gender+"") <=2 ) {
			System.out.println(Integer.parseInt(jumin_year) + 1900);
			System.out.println(jumin_gender);
		}else {
			System.out.println(Integer.parseInt(jumin_year) + 2000);
			System.out.println(jumin_gender);
		}
			
			@SuppressWarnings("deprecation")
			int thisYear = (new Date()).getYear()+1900;
			
			int age = thisYear;

	}
}
