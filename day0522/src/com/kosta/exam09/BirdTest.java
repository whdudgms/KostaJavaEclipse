package com.kosta.exam09;

public class BirdTest {
	
	public static void main(String[] args) {
		
		// 추상클래스 구현되지 않은 메소드가 있기 때문에 객체를 생성할 수 없다
		Dove dv = new Dove();
		
		dv.sound();
		
		// 참조변수가 가르킬 객체는 실제 메서드를 구현했기 때문에 
		// 추상클래스 변수가 자신을 구현한 객체를 가르킬 수 있따. 
		
	}
}
