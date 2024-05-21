package com.kosta.exam03;

abstract public class TwoDimShape extends Shape{
	protected double area;
	public abstract void calcArea();
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public TwoDimShape(int x,int y) {
		super(x,y);
	}

	public TwoDimShape() {
		super();
	}
	
	
	
	
	
}
