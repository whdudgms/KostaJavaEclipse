package com.kosta.exam01;

//사용자한테 두 수를 입력받아 "조화평균"을 구하여 출력하는 프로그램을 작성
import java.util.Scanner;


//조화평균이 있을 수 없는 사용자 정의 예외를 만들어 봅시다.
class NotHarmonicMeanException extends Exception{
	public  NotHarmonicMeanException(String message){
		super(message);
	}
	public NotHarmonicMeanException(){
	} 
}

public class HarmonicMeanTest2  {
	public static void main(String[] args) throws Exception{
		
		try {
		Scanner sc = new Scanner(System.in);
		int a,b,mean;
		System.out.println("첫번째 수 입력 -->");
		a = sc.nextInt();
		System.out.println("두번째 수 입력 -->");
		b = sc.nextInt();
		if (a == -b) {
			throw new NotHarmonicMeanException("두 수의 조합이 옳지 않아요");
		}
		mean = (2*a*b)/ (a+b);
		System.out.println(mean);
		
		}catch(NotHarmonicMeanException e) {
			System.out.println(e.getMessage());
		}
	}
}
