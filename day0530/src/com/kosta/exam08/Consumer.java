package com.kosta.exam08;

//소비자 클래스를 구체화 해 봅니다.
public class Consumer extends Thread{
	private Product product;
	
	public Consumer(Product product) {
		this.product = product;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i <= 10; i++) {
			try {
				product.useNumber();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}