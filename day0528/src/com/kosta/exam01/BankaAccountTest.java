package com.kosta.exam01;


class NegativeBalanceException extends Exception {
	public NegativeBalanceException() {
		super();
	}
	public NegativeBalanceException(String message) {
		super(message);
	}
}


class BankAccount {
	int balance;
	public  boolean deposit(int money) {
		System.out.println(money+"원을 입금");
		balance += money;
		return true;
	}
	public  boolean withdraw(int money) throws  NegativeBalanceException{
		System.out.println(money+"원을 출금");
		if((balance - money) < 0) {
			throw new NegativeBalanceException("거래후 잔액 "+
		(balance - money)+"실패");
		}
		return true;
	}
}


public class BankaAccountTest {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.deposit(100);
		try{
			b.withdraw(1000);
		}catch (NegativeBalanceException e) {
			e.printStackTrace();
		}
	}
}