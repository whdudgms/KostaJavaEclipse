package com.kosta.exam05;

public class BookTest {
	public static void main(String[] args) {
		// 몇권의 도서를 생성하여 연체료를 계산하는
		// 코드를 작성하여 실험 해 봅시다. 
		
		Book p = new Poet("A12", "bo", "jo");
		System.out.println(p.getLateFees(2));
		
		Book s = new ScienceFiction("A12", "bo", "jo");
		System.out.println(s.getLateFees(2));
		
		Book n = new Novel("A12", "bo", "jo");
		System.out.println(n.getLateFees(2));
	}
}
