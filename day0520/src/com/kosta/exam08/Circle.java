package com.kosta.exam08;

public class Circle extends Shape {
	
	private final static double fi = 3.14;
	private int r;
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public double getFi() {
		return fi;
	}
	public Circle(int x, int y, int r) {
		super(x, y);
		calcArea();
		calcRound();
		this.r = r;
	}
	@Override
	public void calcArea() {
		System.out.println(fi* r*r);
		super.area = fi* r*r;
	}
	@Override
	public void calcRound() {
		System.out.println( 2 * fi* r);
		super.round = 2 * fi* r;
	}

}
