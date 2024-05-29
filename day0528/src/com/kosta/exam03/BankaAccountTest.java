package com.kosta.exam03;

import java.util.Scanner;

class NegativeBalanceException extends Exception{
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
		balance += money;
		return true;
	}
	public  boolean withdraw(int money) throws  NegativeBalanceException{
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
		Scanner sc = new Scanner(System.in);
		int ch,mo;
		loop : 
		while(true) {
			System.out.println("계좌거래 서비스 0:취소 1:입금 2:출금");
			ch = sc.nextInt();
			if(ch == 0) {
				break;
			}
			
			switch(ch) {
			case 1:  
				System.out.println("입금 액수를 입력하시오");
				mo = sc.nextInt();
				b.deposit(mo);
				break;
			case 2: 
				System.out.println("출금 액수를 입력하시오");
				mo = sc.nextInt();
				try {
				b.withdraw(mo);
				}catch (NegativeBalanceException e) {
					System.out.println("예외 발생");
				}
				break loop;
			}
		}
	}

}
