package com.kosta.exam31;

public class BirdTest {
	public static void main(String[] args) {
		Bird b1 = new Bird("찍찍이");
		Bird b2 = new Bird("참새");
		Bird b3 = new Bird("비둘기");
		
		
		b1.move(23, 23, 100);
		b2.move(234,122, 33);
		
		
		b1.attack(b2);
		b1.attack(b2);
		b1.attack(b2);

		
	}

}
