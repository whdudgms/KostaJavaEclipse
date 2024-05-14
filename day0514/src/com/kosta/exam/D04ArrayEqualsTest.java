package com.kosta.exam;

import java.util.Iterator;

public class D04ArrayEqualsTest {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {1, 2, 3, 4, 5};
		
		// 길이비교
		if(a.length == b.length) {
			
			// 요소 비교 
			for(int i = 0; i < a.length; i++) {
				if(a[i] == b[i]) {
					continue;
				}else {
				System.out.println("배열의 내용이 일치하지 않습니다.");
				return;
				}
			}
		}else {
		System.out.println("배열의 내용이 일치하지 않습니다.");
		return;
		}
		System.out.println("배열의 내용이 일치합니다.");

		/*
		if(a.equals(b)) {
			System.out.println("배열의 내용이 일치합니다.");
		}else {
			System.out.println("배열의 내용이 일치하지 않습니다.");
		}
		*/
	}
}
