package com.kosta.exam03;

import java.util.Date;

public class sayHello  {
public static void main(String[] args) throws InterruptedException {
		while(true) {
			System.out.println("------------hello-----------");	
			Date d = new Date();
			System.out.print(d.getHours()+"시");	
			System.out.print(d.getMinutes()+"분");	
			System.out.println(d.getSeconds()+"초");	
			Thread.sleep(1000); 
		}
	}
}
