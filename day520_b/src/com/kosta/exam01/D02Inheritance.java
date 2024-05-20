package com.kosta.exam01;

class A{
	String title;
	int year;
	@Override
	public String toString() {
		return "A [title=" + title + ", year=" + year + "]";
	}

	
}

class B extends A{
	String data;

	@Override
	public String toString() {
		return "B [data=" + data + ", title=" + title + ", year=" + year + "]";
	}
	
	public void info() {
		System.out.println(title +"," + year+","+data);
	}
}



public class D02Inheritance {
	public static void main(String[] args) {
		A ob1 = new A();
		B ob2 = new B();
		ob2.title = "hello";
		ob2.year = 2024;
		ob2.data = "java";
		ob2.info();
		System.out.println();
	}
}
