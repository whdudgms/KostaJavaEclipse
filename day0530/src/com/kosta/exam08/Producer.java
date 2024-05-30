package com.kosta.exam08;

//생산자 클래스를 만들어요.
//소비자와 상관없이 계속하여 새로운 제품을 
//생산케 하기 위하여 Thread 클래스를 상속받아
//멀티스레드가 가능하도록 합니다.
public class Producer extends Thread{
	
	//제품을 멤버변수로 선언합니다.
	private Product product;
	
	//생성시에 제품을 매개변수로 전달받아
	//초기화 합니다.
	// 이 제품이 소비자와 공유하는 자원입니다.
	public Producer(Product product) {
		this.product = product;
	}
	
	//생산자 스레드가 해야 할 일을 run을 오버라이딩 하여 써 줍니다.
	public void run() {
		
		//10개의 새로운 제품을 생산하도록 합니다.
		for(int i = 1;  i <= 10; i++) {
			try {
				product.makeNumber();
				Thread.sleep(100);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
