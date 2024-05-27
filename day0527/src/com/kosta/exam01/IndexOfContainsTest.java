package com.kosta.exam01;


//문자열 데이터에 "java를 포함하고 있는지"
public class IndexOfContainsTest {
	public static void main(String[] args) {
		String data = "hello java hello oracle";
		if(data.matches(".*java.*")) {
			System.out.println("자바를 포함하고 있어요");
		}else {
			System.out.println("자바를 포함하고 있지 않아요");
		}
	}
}
