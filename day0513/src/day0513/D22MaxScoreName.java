package day0513;

import java.util.Scanner;

public class D22MaxScoreName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] score = new int[5];
		for(int i = 0; i < score.length; i++) {
			System.out.printf("%d번째 학생의 이름을 입력하세요 ->", i+1);
			name[i] = sc.next();
			System.out.printf("%d번째 학생의 점수를 입력하세요 ->", i+1);
			score[i] = sc.nextInt();
		}
		//맨 첫 번째 요소의 값을 가장 크다고 본다.
		int max = score[0];
		int idx = 0;
		
		//나머지 배열의 모든 요소를 max와 비교하여 
		//그 값이 max보다 더 크다면 그 값을 max에 저장한다. 
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
				idx = i;
			}
		}
		System.out.printf("최고점수는 %d점이고 이름은 %s입니다.", max, name);
		
	}
}
