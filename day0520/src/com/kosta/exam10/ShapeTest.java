package com.kosta.exam10;

import java.util.Scanner;

public class ShapeTest {
	
	public static void main(String[] args) {
//		Circle[] data = new Circle[100];
//		Quadrangle []data2 = new Quadrangle[100];

		//2차원 도형(Circle, Quadrangle)을 어떤것이라도 담을 수 있는 배열을 만듦.
		//이것들의 부모클래스인 Shape으로 배열을 만들어요. 
		Scanner sc = new Scanner(System.in);
		Shape[] data = new Shape[1000];

		
		int menu,x,y,i=0;
		double width, length, radius;
		
		while(true) {
			while(true) {
				System.out.println("도형의 종류를 선택하세요 ->1.사각형     2.원     0.종료");
				menu = sc.nextInt();
				if(menu >= 0 && menu <= 2) {
					break;
				}
			}
			
			if(menu == 0) {
				break;
			}
			System.out.print("도형의  x위치 ->");
			x = sc.nextInt();
			System.out.print("도형의  y위치 ->");
			y = sc.nextInt();

			switch(menu) {
				case 1: 
					System.out.print("사각형의 가로길이 -->");
					width = sc.nextDouble();
					System.out.print("사각형의 세로길이 -->");
					length = sc.nextDouble();
					data[i] = new Quadrangle(x, y, width, length);break;
				case 2: 
					System.out.print("원의 반지름 -->");
					radius = sc.nextDouble();
					data[i] = new Circle(x, y, radius);break;
			}
			i++; // 배열의 인덱스이자 데이터수 
		}

		for(int j = 0; j < i; j++) {
			data[j].calcArea();
			data[j].calcRound();
			System.out.println(data[j]);
		}
	}
}
