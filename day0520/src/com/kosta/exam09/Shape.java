package com.kosta.exam09;

public class Shape {
	protected int x;
	protected int y;
	protected double area;
	protected double round;
	public void calcArea() {}
	public void calcRound() {}
	
	
	
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getRound() {
		return round;
	}
	public void setRound(double round) {
		this.round = round;
	}
	public Shape(int x, int y, double area, double round) {
		super();
		this.x = x;
		this.y = y;
		this.area = area;
		this.round = round;
	}
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Shape() {
		super();
	}
	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + ", area=" + area + ", round=" + round + "]";
	}

}
