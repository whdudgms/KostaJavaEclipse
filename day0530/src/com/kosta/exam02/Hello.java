package com.kosta.exam02;
public class Hello implements  Runnable {
	public void run() {
	}
	public static void main(String[] args) {
		Thread t = new Thread(new Hello());
		t.start();
	}
}