package com.kosta.exam09;


public class ShapeTest {
	
	public static void main(String[] args) {
//		Circle[] data = new Circle[100];
//		Quadrangle []data2 = new Quadrangle[100];

		//2차원 도형(Circle, Quadrangle)을 어떤것이라도 담을 수 있는 배열을 만듦.
		//이것들의 부모클래스인 Shape으로 배열을 만들어요. 
		Shape[] data = new Shape[3];
		data[0] = new Circle(10, 10, 50);
		data[1] = new Quadrangle(10, 200, 100, 100);
		data[2] = new Circle(10, 310, 25);

		for(int i=0; i < data.length; i++) {
			data[i].calcArea();
			data[i].calcRound();
			System.out.println(data[i].toString());
		}
		
	}
}
