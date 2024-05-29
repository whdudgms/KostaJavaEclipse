package com.kosta.exam06;

public class TestMain {
	public static void main(String[] args) throws InterruptedException {
		
		TimeThread t = new TimeThread();
		t.start();
		new CountDownEvent(15,"모든게 15초후에 끝");
		
	}
}
