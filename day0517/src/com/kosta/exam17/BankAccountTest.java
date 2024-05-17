package com.kosta.exam17;


class BankAccount{
	String name;
	String account;
	int money;
	double e;
	
	public BankAccount() {
		super();
	}
	
	public BankAccount(String name, String account, int money, double e) {
		super();
		this.name = name;
		this.account = account;
		this.money = money;
		this.e = e;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}

	
}

public class BankAccountTest {

}
