package com.kosta.exam03;
import java.util.Scanner;

class Student {
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
	@Override
	public String toString() {
		return "Student [name=" + name + ",\t kor=" + kor + ",\t eng=" + eng + ",\t math=" + math + ",\t tot=" + tot + ",\t avg="
				+ avg + "]";
	}
}

// 
// 배열 생성(student 참조변수 5개 생성)
// 객체 생성(student 객체 생성)
public class D09StudentClassTestArraySort {
	public static void main(String[] args) {
		Student[] data = new Student[5]; // 배열생성(new) student생성(new) 2번 해줘야함
		Scanner sc = new Scanner(System.in);
		for(int i =0; i < data.length; i++) {
			data[i] = new Student(); // 객체생성 
			System.out.print("학생의 이름 -->");
			data[i].name =sc.next();
			System.out.print("학생의 국어 -->");
			data[i].kor= sc.nextInt();
			System.out.print("학생의 영어 -->");
			data[i].eng = sc.nextInt();
			System.out.print("학생의 수학 -->");
			data[i].math = sc.nextInt();
			data[i].tot = data[i].kor + data[i].eng + data[i].math;
			data[i].avg = (data[i].tot / 3.0);
		}
		System.out.println("		*** 성적순 처리 결과 ***");
		System.out.println("\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------------------ -");
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i].toString());
		}
		for(int i = 0; i <data.length;i++) {
			for(int j = i+1; j < data.length; j++) {
				if(data[j].tot > data[i].tot) {
					Student temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		System.out.println("		*** 성적순 처리 결과 ***");
		System.out.println("\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------------------ -");
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i].toString());
		}

	}
}
