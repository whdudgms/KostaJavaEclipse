package com.kosta.exam05;

public class Customer extends Person {
	private int no;
	private int mileage;
	private String phone;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public Customer(String name, String addr, String phone, int no, int mileage) {
		super(name, addr, phone);
		this.no = no;
		this.mileage = mileage;
	}
	public Customer() {
	
		super();
		
	}
	
	
	
	@Override
	public String toString() {
		String pa = super.toString();
		return "Customer [no=" + no + ", mileage=" + mileage + ", name=" + name + ", addr=" + addr + ", phone=" + phone
				+ "]";
	}
	
	
	
	
}
