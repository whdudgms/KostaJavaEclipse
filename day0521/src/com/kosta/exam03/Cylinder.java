package com.kosta.exam03;


public class Cylinder extends TriDimShape {
	private double radius;
	private double height;
	private final double PI = 3.14;

	@Override
	public void calcVolume() {
		volume = radius * radius * PI *height;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public double getPI() {
		return PI;
	}

	@Override
	public String toString() {
		return "Cylinder [PI=" + PI + ", height=" + height + ", radius=" + radius + ", volume=" + volume + ", x=" + x
				+ ", y=" + y + "]";
	}
	public Cylinder(int x, int y, double radius, double height) {
		super(x, y);
		this.radius = radius;
		this.height = height;
	}
	public Cylinder() {
		super();
	}

}
