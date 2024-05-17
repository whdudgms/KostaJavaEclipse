package com.kosta.exam17;

class BankAccount{
	private String name;
	private String num;
	private double balance;
	private double rate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public BankAccount(String name, String num, double balance, double rate) {
		super();
		this.name = name;
		this.num = num;
		this.balance = balance;
		this.rate = rate;
	}
	public BankAccount() {
		super();
	}
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", num=" + num + ", balance=" + balance + ", rate=" + rate + "]";
	}
	
}

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount("임유나","1111-2222-3333-4444",10000,2.5);
		System.out.println(ba);
	}
}