package com.kosta.exam01;

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
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot + ", avg="
				+ avg + "]";
	}
}

public class D07StudentClassTest {
	public static void main(String[] args) {
		Student st = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생의 이름 -->");
		st.name =sc.next();
		System.out.print("학생의 국어 -->");
		st.kor= sc.nextInt();
		System.out.print("학생의 영어 -->");
		st.eng = sc.nextInt();
		System.out.print("학생의 수학 -->");
		st.math = sc.nextInt();
		
		st.tot = st.kor + st.eng + st.math;
		st.avg = (st.tot / 3.0);
		System.out.println(st);
	}
}
