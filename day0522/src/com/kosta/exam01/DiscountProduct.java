package com.kosta.exam01;

public class DiscountProduct extends Product{
	private double rate;

	
	public DiscountProduct() {
		super();
	}
	
	
	
	@Override
	public int getPrice() {
		return (int)(price -(price * rate));
	}



	public DiscountProduct(String name, int price, double rate) {
		super(name, price);
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "DiscountProduct [rate=" + rate + ", name=" + name + ", price=" + price + "]";
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
}
