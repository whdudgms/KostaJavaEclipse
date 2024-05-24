package com.kosta.exam03;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomTest {

	public static void main(String[] args) {
		//1부터 난수 
		Random r=  new Random();
		//int data = r.nextInt(45)+1;
		//System.out.println(data);
		
		Set set = new TreeSet();
		
		
		
		// 
		while(set.size() < 7) {
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);
		}
}
