package com.kosta.exam21;

public class BankAccount {
	// 은행계좌 
		private double balance;
		public void withdraw(int amount) { // 인출하는 메소드 
			if(balance < amount) {
				System.out.println("마이너스입니다.");
				return;
			}
			balance = balance - amount;
		}
		public void deposit(int amount) {  // 저금을 하는 메소드 		
			balance = balance + amount;
		}
		public double getBalance() { 	// 현재의 잔고를 반환하는 메소드 
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
	public void addInterest() {
			balance = (int)(balance+ balance*0.075);
		}
	 public void printBalance() {
			System.out.println("현재 잔액 :"+balance);
		}
	}