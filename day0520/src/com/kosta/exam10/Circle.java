package com.kosta.exam10;

public class Circle extends Shape {
	
	private final static double fi = 3.14;
	private double r;
	public double getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public double getFi() {
		return fi;
	}
	public Circle(int x, int y, double r) {
		super(x, y);
		calcArea();
		calcRound();
		this.r = r;
	}
	@Override
	public void calcArea() {
		super.area = fi* r*r;
	}
	@Override
	public void calcRound() {
		super.round = 2 * fi* r;
	}
	@Override
	public String toString() {
		return "Circle [r=" + r + ", x=" + x + ", y=" + y + ", area=" + area + ", round=" + round + "]";
	}
	
	

}
