package com.kosta.exam03;

public class Cube extends TriDimShape {
	private double width;
	private double length;
	private double hight;
	@Override
	public void calcVolume() {
		volume += width * length * hight;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	public Cube(int x, int y, double width, double length, double hight) {
		super(x, y);
		this.width = width;
		this.length = length;
		this.hight = hight;
	}
	public Cube() {
		super();
	}
}
