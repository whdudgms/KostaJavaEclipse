package com.kosta.exam18;


// public 을 붙이면 PUBLIC 붙은 클래스가 파일명과 일치행함 파일명과 일치하는 main이 실행됨 끝 ^^ 
class BankAccount{
	public static void main(String[] args) {
		System.out.println("BankAccount main");
	}
	double balance = 0;
	void deposit(int amount) {
		balance += amount;
	}
	void withdraw(int amount) {
		if(balance - amount < 0 ) {
			System.out.println("잔고가 음수라 취소");
			return;
		}
		balance -= amount;
	}
	double getBalance() {
		return balance;
	}
	
	void printBalance() {
		System.out.println(balance);
	}
	
	void addInterest() {
		balance += (balance * 0.075);
		System.out.println(balance);

	}
	
}

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		
		a1.deposit(100);
		a2.deposit(50);
		
		a1.withdraw(60);
		a2.withdraw(30);
		
		System.out.println(a1.getBalance());
		System.out.println(a2.getBalance());
		
		a1.addInterest();
		System.out.println(a1.getBalance());

	}
}