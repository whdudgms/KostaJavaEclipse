package com.kosta.exam01;
public class Hello implements  Runnable {
	public void run() {
	}
	public static void main(String[] args) {
		Thread t = new Thread(new Hello());
		t.start();
	}
}