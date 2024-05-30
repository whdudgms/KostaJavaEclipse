package com.kosta.exam08;

import java.util.Random;

//생산자와 소비자가 공유할 자원인 "제품"클래스를 만들어요.
//새로운 정수를 제품이라 봅시다.
public class Product {
	
	// 제품을 위한 정수형 변수를 선언
	// 생산자는 이 정수를 계속하여 새롭게 만들어 주고 
	// 소비자는 이 정수르 계속하여 가져다 쓰도록 합니다.
	int number;
	
	//새 제품이 생산되었는지 판별하기 위한 변수 
	// 생산자는 새 제품을 생산한 다음 isNew에 true를 저장
	// 소비자는 새 제품을 소비한후 isNew에 false를 저장 
	boolean isNew;
	
	//생상자가 새 제품을 생산하기 위한 메서드 
	//생산자는 새 제품을 만들고 있는 동안 
	// 소비자는 접근을 못해야 하므로 임계영역에 설정으 ㄹ위하여
	//synchronized키워드를 붙입니다.
	public synchronized void makeNumber()  {
		//제품이 소비될때까지 기다려요
			try {
				while(isNew == true) {
				wait();
				}
				//새 제품을 만들어요
				Random r= new Random();
				number = r.nextInt(100)+1;
				//생산된 제품을 출력
				System.out.println("생산자가 생산함==>"+number);
				//새 제품을 만들었다고 표시합니다.
				isNew =true;
				// 대기중인 소비자를 깨워줍니다.
				notify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	// 소비자가 사용하는 메소드 
	public synchronized  void useNumber() {
		int n =  0;
		try {
		//제품이 소비생산될 때까지 기다려요
			while(isNew == false) {
				wait();
			}
			n = number;
			System.out.println("소비자가 소비==>"+n);
			isNew = false;
			//대기중인 다른 스레드를 깨워줍니다.
			notify();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}