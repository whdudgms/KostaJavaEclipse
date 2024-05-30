package com.kosta.exam07;

//모금액을 위한 클래스
public class Account {
	
	//잔액을 위한 변수 
	private int balance;
	
	//입금을 위한 메서드 
	public synchronized  void call(String name, int n, int amount){
		System.out.println(name+"의 " +n +"번째 입금");
		if(balance >= 500000) {
			System.out.println("입금실패!");
			return;
		}
		balance +=  amount;
	}
	
	//현재 잔액을 반환하는 메서드 
	public synchronized int getBalance() {
		return balance;
	}
	
}
