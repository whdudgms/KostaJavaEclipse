package com.kosta.exam02;

import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
//		SalariedEmployee e1 = new SalariedEmployee("임유나","A1000",1);
//		SalariedEmployee e2 = new SalariedEmployee("임유나","A1000",2);
//		HourlyEmployee h1 = new HourlyEmployee("조영흔","H001",1000000,20);
//		
//		e1.computeSalary();
//		e2.computeSalary();
//		h1.computeSalary();
//		
//		System.out.println(e1.getSalary()); // 다형성 여러가지 형태를 가질수 있음
//		System.out.println(e2.getSalary());
//		System.out.println(h1.getSalary());
		
		
		Employee[] e = new Employee[1000];
		Scanner sc = new Scanner(System.in);
		
		int option,level,i,time,per;
		String name,no;
		i = 0;
		while(true) {
			System.out.println("옵션을 선택하시오 1.급여 근무자   2.시간제 근무자  0. 종료 ");
			option = sc.nextInt();
			if(option == 0) {
				break;
			}else if(option != 1 && option != 2){
				System.out.println("올바른 선택을 하세요!");
				continue;
			}
			System.out.println("이름을 입력하세요!");
			name = sc.next();
			System.out.println("번호를 입력하세요!");
			no = sc.next();

			while(true) {
				if(option ==1) {
					System.out.println("호봉을 입력하세요 1,2,3 중에서만 !!!");
					level = sc.nextInt();
					e[i] = new SalariedEmployee(name, no, level);
					e[i].computeSalary();
				}else {
					System.out.println("근무시간을 입력하시오");
					time = sc.nextInt();
					System.out.println("시급을 입력하세요");
					per = sc.nextInt();
					e[i] = new HourlyEmployee(name, no, per, time);
					e[i].computeSalary();
				}
				break;
			}
			i++;
		}
		System.out.println("입력 프로그램 종료");
		System.out.println(i);
		for(int j = 0; j < i; j++) {

			System.out.println(e[j].toString());
		}
		
		
	}
}
