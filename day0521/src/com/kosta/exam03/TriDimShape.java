package com.kosta.exam03;

public abstract class TriDimShape extends Shape {
	protected double volume;
	public abstract  void calcVolume();
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public TriDimShape(int x, int y) {
		super(x, y);
	}
	public TriDimShape() {
		super();
	}
	
	
	
	
}
