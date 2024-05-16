package com.kosta.exam;

class Student extends Object{
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

public class D06StudentClassTest {
	public static void main(String[] args) {
		Student st = new Student();
		st.kor= 100;
		st.eng = 80;
		st.math = 90;
		st.name ="홍길동";
		st.tot = st.kor + st.eng + st.math;
		st.avg = (st.tot / 3.0);
		System.out.println(st);
	}
}
