package com.kosta.exam23;

public class DiceTest {
	public static void main(String[] args) {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		d1.roll();
		d2.roll();
		System.out.println(d1.getFace());
		System.out.println(d2.getFace());
	}
}
