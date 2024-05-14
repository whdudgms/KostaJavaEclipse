package day0513;

import java.util.Scanner;

public class D22_MaxName {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		String[] name = new String[5];
		

		
		for(int i = 0; i < score.length; i++) {
			System.out.println("이름을 입력해 주새요 ");
			name[i] = sc.next();
			System.out.println("점수를 입력해 주새요 ");
			score[i] = sc.nextInt();
		}
		
		int maxIndex = 0;
		
		for(int i = 1; i < score.length; i++) {
			if(score[maxIndex] < score[i]) {
				maxIndex = i;
			}
		}
		
		System.out.println(maxIndex);
		System.out.println(score[maxIndex]);
		System.out.println(name[maxIndex]);
	}
}
