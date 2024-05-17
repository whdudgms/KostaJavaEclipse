package com.kosta.exam08;

class Employee{
	private String name;
	private String phone;
	private int sal;
	
	public Employee() {
		System.out.println("Employee생성자가 시작된다");
		name = "임유나";
		phone = "010-2341-2342";
		sal = 5000;
	}

	public void setName(String name){
		this.name = name;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public void setSal(int sal){
		this.sal = sal;
	}
	
	public String getName( ) {
		return this.name;
	}
	public String getPhone() {
		return this.phone;
	}
	public int getSal() {
		return this.sal;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", sal=" + sal + "]";
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee();
//		e.setName("홍길동");
//		e.setPhone("010-2345-7623");
//		e.setSal(5000);
		System.out.println(e);
	}
}
