package com.kosta.exam06;

public class CountDownEvent {
	
	
	public CountDownEvent(int cho, String str) throws InterruptedException {
		
		Thread.sleep(cho *1000);
		System.out.println(str);
		
	}

}
