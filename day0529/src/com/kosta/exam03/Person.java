package com.kosta.exam03;

public class Person implements Runnable{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	
	@Override
	public void run() {
		for(int i =1; i <= 10; i++) {
			System.out.println("hello,"+name+"==>"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
