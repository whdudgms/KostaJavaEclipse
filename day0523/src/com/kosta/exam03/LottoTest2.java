package com.kosta.exam03;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoTest2 {
	public static void main(String[] args) {
		Random r=  new Random();
		Set set = new TreeSet();
		while(set.size() < 7) {
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);
	}
}


