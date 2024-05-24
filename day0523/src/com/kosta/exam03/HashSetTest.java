package com.kosta.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		//HashSet LinkedHashSet TreeSet
		
		
		// HashSet 입력한 순서를 유지 하지 않아요.
		// LinkedHashSet 입력한 순서를 유지합니다.
		// TreeSet : s
		
		Set data= new HashSet();
		
		//equals가 오버라이딩 되어있다.
		boolean f1 = data.add(100);
		boolean f2 = data.add("사과");
		boolean f3 = data.add("56.7");
		data.add(true);
		boolean f4 = data.add(100);
		
		Iterator a = data.iterator();
		
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		System.out.println();

		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		
		System.out.println(data);
		System.out.println(data.size());
	}
}
