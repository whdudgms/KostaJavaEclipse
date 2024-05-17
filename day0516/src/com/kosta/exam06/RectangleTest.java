package com.kosta.exam06;


class Rectangle{
	private double width;
	private double length;
	
	public double calcArea(){
		double area = width * length;
		return area;
	}
	
	public void setWidth(double width) {
		this.width = width;
		return;
	}
	public void setLength(double length) {
		this.length = length;
		return;
	}
	
	public double getWidth() {
		return this.width;
	}
	public double getLength() {
		return this.length;
	}
}

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setWidth(200);
		r1.setLength(300);
		System.out.println("가로:"+r1.getLength());
		System.out.println("가로:"+r1.getWidth());
		System.out.println("면접:"+r1.calcArea());
	}
}
