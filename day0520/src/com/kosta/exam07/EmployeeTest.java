package com.kosta.exam07;

public class EmployeeTest {
	public static void main(String[] args) {
		SalariedEmployee e1 = new SalariedEmployee("임유나","A1000",1);
		SalariedEmployee e2 = new SalariedEmployee("임유나","A1000",2);
		HourlyEmployee h1 = new HourlyEmployee("조영흔","H001",1000000,20);
		
		e1.computeSalary();
		e2.computeSalary();
		h1.computeSalary();
		
		System.out.println(e1.getSalary()); // 다형성 여러가지 형태를 가질수 있음
		System.out.println(e2.getSalary());
		System.out.println(h1.getSalary());
	}
}
