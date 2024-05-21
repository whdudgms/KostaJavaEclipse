package com.kosta.exam02;

public abstract class Employee {
	protected String name; //이름
	protected String no;   //사번
	
	public Employee(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	
	public Employee() {
		super();
	}

	public abstract void computeSalary();

}
