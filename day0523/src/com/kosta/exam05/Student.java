package com.kosta.exam05;

public class Student {
	private String name;
	private String address;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Student(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public Student() {
		super();
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s;
		if(obj instanceof Student ) {
			s = (Student)obj;
		}else {
			return false;
		}
		if(this.getName().equals(s.getName()) &&  this.getPhone().equals(s.getPhone()) && this.getAddress().equals(s.getAddress()))
		return true;
		
		return false;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	
	
	

}
