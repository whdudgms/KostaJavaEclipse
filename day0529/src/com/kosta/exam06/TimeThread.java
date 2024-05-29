package com.kosta.exam06;

public class TimeThread extends Thread{
	
	int i = 20;
	
	@Override
	public void run(){
		while(i >= 0){
			System.out.println(i);
				try {
					Thread.sleep(1000);
					i--;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		System.out.println("시간끝");

	}

}
