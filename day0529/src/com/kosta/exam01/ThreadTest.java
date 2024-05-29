package com.kosta.exam01;


class Man extends Thread{
	private String name;
	public Man(String name) {
		super();
		this.name = name;
	}
	@Override
	public void run() {
		super.run();
		for(int i = 1; i <= 1000; i++) {
			System.out.println("hello, "+name + ", " +i);
	}
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		
		Man kim = new Man("김호도");
		Man jo = new Man("조자윤");
		
		jo.start();
		kim.start();
	}
	}

