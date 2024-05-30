package com.kosta.exam03;

//성금자를 위한 클래스 (전화를 걸어서 모금액을 증가시키도록 합니다.)
// 다른 성금자와 관계없이 계속하여
// 입금을 위하여 쓰레드를 상속받아요.
public class Person extends Thread {
	//성금자 이름을 위한 멤버변수 
	String name;
	//다른 성금자와 모금액을 공유하기 위하여 
	// 모금액 클래스인 Account를 멤버변수로 선언합니다.
	Account account;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	//생성시에 성금자 이름과 
	//모금액 객체를 매개변수로 전달받아 초기화 해 줍니다. 
	public Person(String name, Account account) {
		super();
		this.name = name;
		this.account = account;
	}



	//성금자가 해야할 일을 run을 오버라이딩하 써 줍니다.
	@Override
	public void run() {
		// 1000원씩 10번을 입금하도록 해 봅니다.
		for(int i = 1; i <= 10; i++) {
			account.call(1000);
			System.out.println(name+"의 "+i+"번째 입금"+account.getBalance());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
