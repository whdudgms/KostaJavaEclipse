package com.kosta.exam31;


public class planeTest {
	public static void main(String[] args) {
		Plane p1 = new Plane();
		Plane p2 = new Plane("A380",500);
		
		p1.setModel("A380");
		p2.setModel("A380");
		
		System.out.println(p1.getPlanes());
 
	}
}
