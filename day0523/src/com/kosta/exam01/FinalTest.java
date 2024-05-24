package com.kosta.exam01;

class A{
	public void pro() {
		System.out.println("A Pro");
	}
}
class B extends A{
	public void pro() {
		System.out.println("B Pro");
	}
}

interface A2{
}
interface B2 extends A2{
}
public class FinalTest {
	public static void main(String[] args){
		B ob = new B();
	}
}
