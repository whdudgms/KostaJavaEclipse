package com.kosta.exam07;

public class SalariedEmployee extends Employee {
	private int salary;
	// 호봉에 따라 기본급과 수당을 결졍해서 월급을 계산 
	private int level; 	//월급
	private int base;	//호봉
	private int allowances;	//기본금
	

	@Override
	public void computeSalary() {
		switch(level) {
			case 1: base = 4000000;allowances=4000000;break;
			case 2: base = 5000000;allowances=5000000;break;
			case 4: base = 6000000;allowances=6000000;break;
		}
		salary = base  + allowances;
	}	
	
	
	
	public SalariedEmployee() {
	
	}

	public SalariedEmployee(String name, String no, int level) {
		super(name, no);
		this.level = level;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAllowances() {
		return allowances;
	}
	public void setAllowances(int allowances) {
		this.allowances = allowances;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", level=" + level + ", base=" + base + ", allowances="
				+ allowances + ", name=" + name + ", no=" + no + "]";
	}

	
	
}
