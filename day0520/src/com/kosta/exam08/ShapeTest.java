package com.kosta.exam08;

public class ShapeTest {
	
	public static void main(String[] args) {
		Quadrangle q = new Quadrangle(10,10,100,100);
		Circle c = new Circle(10, 200, 50);
		q.calcRound();
		q.calcArea();
		System.out.println(q.toString());
		
		c.calcRound();
		c.calcArea();
		System.out.println(c.toString());
	}
}
