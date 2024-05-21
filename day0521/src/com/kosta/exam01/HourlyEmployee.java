package com.kosta.exam01;

public class HourlyEmployee  extends Employee{

	int per;	// 시급
	int time;	// 일하는 시간 
	int salary;

	
	@Override
	public void computeSalary(){
		salary = per  * time;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public HourlyEmployee(String name, String no, int per, int time) {
		super(name, no);
		this.per = per;
		this.time = time;
	}
	public HourlyEmployee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HourlyEmployee [per=" + per + ", time=" + time + ", salary=" + salary + ", name=" + name + ", no=" + no
				+ "]";
	}
	
	
	
}
