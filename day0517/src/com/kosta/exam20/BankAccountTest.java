package com.kosta.exam20;

// addInterest메서드의 동작방식을 변경했을 때 호출한 쪽에서 수정할 부분은 없어요.
// 

class BankAccount{
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
	// int는 double에 포함이 된다.
	// double data =5.0;
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

public class BankAccountTest {
	public static void main(String[] args) {
		//  a1 a2 두개의 BankAccount 객체를 생성한다.
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		// a1의 잔고를 100으로 한다.
		a1.setBalance(100);
		// a2의 잔고를 50으로 한다. 
		a2.setBalance(50);
		
		// a1에서 60을 인출한다.
		a1.withdraw(60);
		
		// a1에서 30을 인출한다.
		a2.withdraw(30);
		
		//a1의 잔고를 얻어서 화면에 출력한다.
		System.out.println(a1.getBalance());
		
		//a2의 잔고를 얻어서 화면에 출력한다.
		System.out.println(a2.getBalance());
		
		
		a1.printBalance();
		a2.printBalance();
		
		a1.addInterest();
		a2.addInterest();
		
		a1.printBalance();
		a2.printBalance();
	}
}


