package com.kosta.exam31;

public class Plane {
	private String model;
	private int num;
	public static int planes;
	
	public static int getPlanes() {
		return planes;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public Plane(String model, int num) {
		super();
		planes++;
		this.model = model;
		this.num = num;
	}
	
	public Plane() {
		super();
		planes++;
	}

	@Override
	public String toString() {
		return "Plane [model=" + model + ", num=" + num + "]";
	}
	
	
	
}
