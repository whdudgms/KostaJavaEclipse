package com.kosta.exam;

import java.util.Iterator;
import java.util.Scanner;

//5명 학생의 이름, 국어, 영어, 수학을 입력받아 총점, 평균을 구하고 
//성적순으로 정렬하여 출력 
public class D05StudentSortTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String []name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] tot = new int[5];
		double[] avg = new double[5];
		
		for(int i = 0; i < name.length; i++) {
			System.out.printf("%d번째 학생의 이름 -->",i+1);
			name[i] = sc.next();
			System.out.printf("%d번째 학생의 국어점수 -->",i+1);
			kor[i] = sc.nextInt();
			System.out.printf("%d번째 학생의 영어점수 -->",i+1);
			eng[i] = sc.nextInt();
			System.out.printf("%d번째 학생의 수학점수 -->",i+1);
			math[i] = sc.nextInt();
			tot[i] = (kor[i] + eng[i] +math[i]);
			avg[i] = (kor[i] + eng[i] +math[i])/3.0;
		}
		
		// 성적이 높은 순으로 정렬하기 
		String tempS ="";
		int tempI =0;
		double tempD =0.0;
		for(int i = 0; i  < tot.length; i++) {
			for(int j = i+1; j < tot.length; j++){
				if(tot[j] > tot[i]) {
					tempS = name[i];
					name[i] = name[j];
					name[j] = tempS;
					
					tempI = kor[i];
					kor[i] = kor[j];
					kor[j] = tempI;
					
					tempI = eng[i];
					eng[i] = eng[j];
					eng[j] = tempI;
					
					tempI = math[i];
					math[i] = math[j];
					math[j] = tempI;
					
					tempI = tot[i];
					tot[i] = tot[j];
					tot[j] = tempI;
					
					tempD = avg[i];
					avg[i] = avg[j];
					avg[j] = tempD;
				}
			}  
		}
		System.out.println("		*** 성적순 처리 결과 ***");
		System.out.println("\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------------------ -");
		for(int i = 0; i<name.length; i++) {
			System.out.printf("\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
					name[i],kor[i],eng[i],math[i],tot[i],avg[i]);
		}
	}
}
