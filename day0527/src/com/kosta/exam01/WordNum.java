package com.kosta.exam01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력해주세요 몇개의 단어인지 알려드릴게요");
		String line = sc.nextLine();
		
		int i = 0;
		StringTokenizer st = new StringTokenizer(line," ");
		
		while(st.hasMoreElements()) {
			st.nextElement();
			i++;
		}
		System.out.println(i);
		
		for(int j = line.length()-1; 0 <= j; j--) {
			System.out.print(line.charAt(j));
		}
		System.out.println();
		boolean flag = true;
		
		int b = line.length()-1;
		for(int a = 0;a < line.length(); a++ ) {
			if(line.charAt(a) != line.charAt(b)) {
				flag = false;
			}
			if(a == b) {
				break;
			}
			b--;
		}
		
		System.out.println(flag);
		
	}

}
