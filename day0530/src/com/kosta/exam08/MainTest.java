package com.kosta.exam08;

public class MainTest {
	public static void main(String[] args) {
		
		Product p = new Product();
		Consumer c = new Consumer(p);
		Producer pd = new Producer(p);
		
		c.start();
		pd.start();
		
	}
}
