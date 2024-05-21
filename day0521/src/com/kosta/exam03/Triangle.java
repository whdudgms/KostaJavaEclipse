package com.kosta.exam03;

public class Triangle extends TwoDimShape {
	private double width;
	private double height;

	public Triangle() {
		super();
	}

	public Triangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getheight() {
		return height;
	}
	
	public void setheight(double height) {
		this.height = height;
	}
	
	@Override
	public void calcArea() {
		area = (width * height)/2;
	}
	
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", area=" + area + ", x=" + x + ", y=" + y + "]";
	}
	
}
