package com.kosta.exam08;

class Proto{
	
	Proto(){
		System.out.println("Proto기본 생성자 ");
	}
}

class Car extends Proto{
	private int wheel;
	private int speed;
	
	Car(){
		System.out.println("기본 생성자 호출");
	}
	
	Car(int wheel,int speed){
		this();
		System.out.println("Car(int wheel,int speed){ 생성자 호출}");
		this.wheel = wheel;
		this.speed = speed;
	}
	
}
public class CarTest {
	public static void main(String[] args) {
	
		new Car();
		
		new Car(1,1);
	}

}
