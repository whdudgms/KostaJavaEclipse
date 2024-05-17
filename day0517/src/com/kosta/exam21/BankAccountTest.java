package com.kosta.exam21;

// addInterest메서드의 동작방식을 변경했을 때 호출한 쪽에서 수정할 부분은 없어요.
// 


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


