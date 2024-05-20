package com.kosta.exam09;

public class Quadrangle extends Shape{
	private int width;
	private int height;
	
	public Quadrangle(int x, int y, int width, int height) {
		super(x, y);
		calcArea();
		calcRound();
		this.width = width;
		this.height = height;
	}

	public Quadrangle() {
		super();
	}
	 
	@Override
	public String toString() {
		return "Quadrangle [width=" + width + ", height=" + height + ", x=" + x + ", y=" + y + ", area=" + area
				+ ", round=" + round + "]";
	}

	@Override
	public void calcArea() {
		super.area = width * height;
	}
	@Override
	public void calcRound() {
		super.round = width *2 + height *2;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
