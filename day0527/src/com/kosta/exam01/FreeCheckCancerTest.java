package com.kosta.exam01;

import java.util.Date;
import java.util.Scanner;

// 사용자한테 주민번호를 입력받아(하이픈포함)
// 무료암검진 대상자 인지 판별하는 프로그램을 작성합니다.
// 무료암검진 대상자는 40세 이상 올해가 홀수연도에 태어나면 홀수연도에 태어난 사람이고
// 올해가 짝수 년도이면 짝수 년도에 태어난 사람 무료 암검진 항목은 다음과 같다. 
// 40세 이상 남자면 위암, 간암, 일반암
// 40세 이상 여자면 위암, 간암, 일반암, 유방암
// 50세 이상 남자면 위암, 간암, 일반암, 대장암
// 50세 이상 여자면 위암, 간암, 일반암, 유방암, 대장암


public class FreeCheckCancerTest {
	public static void main(String[] args) {
		
		
		System.out.println("주민번호를 입력");
		Scanner sc = new Scanner(System.in);
		String jumin = sc.next();
		String ju_year  = jumin.substring(0, 2);
		int ju_gender  = Integer.parseInt( jumin.substring(7, 8));
		int year = Integer.parseInt(ju_year) +1900;
		
		int age = (new Date()).getYear()+1900 - year;
		
		System.out.println(ju_year);
		System.out.println(ju_gender);
		System.out.println(age);
		
		if(ju_gender <= 2) {
			if(age < 50 && age >= 40 ) {
				if(ju_gender ==1) {
					System.out.println("40세 이상 남자면 위암, 간암, 일반암");
				}else{
					System.out.println(" 40세 이상 여자면 위암, 간암, 일반암, 유방암");
				}
			}else if  (age >= 50 ){
				if(ju_gender ==1) {
					System.out.println("50세 이상 남자면 위암, 간암, 일반암, 대장암");

				}else {
					System.out.println(" 50세 이상 여자면 위암, 간암, 일반암, 유방암, 대장암");
				}
			}
			
			
		}else {
			year += 100;
			System.out.println("대상자 아님");
			
			
		}
		

		
		
	}
}
