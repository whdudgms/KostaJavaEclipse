package com.kosta.exam01;

public class ProductTest{
	public static void main(String[] args){
		Product p1 = new Product("toothbrush", 3000);
		Product p2 = new DiscountProduct("toothbrush", 3000, 0.15);
		System.out.println(p2.getPrice());
	}
}
