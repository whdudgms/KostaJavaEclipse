package com.kosta.exam31;

public class BirdTest {
	public static void main(String[] args) {
		
		/*
		 * 이름만 넣어서 만들기 
		 * 디폴트 새의 기본스펙 
		 * 	this.hp = 60;
			this.hitPoint = 25;
			this.wingSize = 100;
			this.height = 66;
			this.weight = 20;
			this.maxSpeed = 75;
			this.canFly = true;
		 */
		
		
		Bird b1 = new Bird("비둘기");
		Bird b2 = new Bird("참새");
		
		//이동기능 테스트
		b1.move(23, 23, 100);
		b2.move(234,122, 33);
		
		// 공격입혀보기
		b1.attack(b2);
		b2.attack(b1);
		b1.attack(b2);
		b1.attack(b2);


		
	}

}
