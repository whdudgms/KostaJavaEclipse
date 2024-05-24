package com.kosta.exam05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListStudent {
	static Scanner sc = new Scanner(System.in);

	
	public static void menu() {
		System.out.println("메뉴를 선택하세요");
		System.out.println("1.추가 \n2.검색 \n3.삭제 \n0.종료");
	}
	
	public static void insertStudent(ArrayList<Student> list) {
		String name,addr,phone;
		System.out.println("*** 학생정보 추가 ***");
		System.out.print("이름을 입력하세요.");
		name = sc.next();
		System.out.print("주소를 입력하세요.");
		addr = sc.next();
		System.out.print("전화를 입력하세요.");
		phone = sc.next();
		Student student = new Student(name,addr,phone);
		list.add(student);
		System.out.println("학생의 정보를 추가하였습니다.");
		System.out.println("------------------------------------------------------");
	}
	
	public static void searchStudent(ArrayList<Student> list) {
		String phone;
		System.out.println("*** 학생정보 검색 ***");
		System.out.println("찾고자하는 학생의 전화번호를 입력하시오==>");
		phone = sc.next();
		boolean flag = false;
		for(Student s : list ) {
			if(phone.equals(s.getPhone())) {
				System.out.println("*** 찾고자 하는 학생의 정보 ***");
				System.out.println(s.toString());
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println("찾고자 하는 학생의 정보는 없습니다.");
			System.out.println("입력 전화 번호  " + phone);
		}
		System.out.println("------------------------------------------------------");
	}
	
	public static void deleteStudent(ArrayList<Student> list) {
		String phone;
		System.out.println("*** 학생정보 삭제 ***");
		System.out.println("삭제하고자 하는 학생의 전화번호를 입력하시오==>");
		phone = sc.next();
		int preSize = list.size();
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			if(s.getPhone().equals(phone)) {
				list.remove(i);
				System.out.println("해당 학생의 정보를 삭제하였습니다.");
				break;
			}
		}
		if(preSize == list.size()) {
			System.out.println("일치하는 학생의 정보가 없습니다.");
			System.out.println("입력하신 전화 번호 :" +phone);
		}
		System.out.println("------------------------------------------------------");

	}
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		// 추가 검색 삭제 메뉴 제공 
		// for each사용 
		int sel;

		while(true) {
			menu();
			sel = sc.nextInt();
			if(sel == 0) {
				break;
			} // end if
			switch(sel){
			case 1:
				insertStudent(list);
				break;
			case 2:
				searchStudent(list);
				break;
			case 3:
				deleteStudent(list);
				break;
			}
		}// end while 
		
	}
}
