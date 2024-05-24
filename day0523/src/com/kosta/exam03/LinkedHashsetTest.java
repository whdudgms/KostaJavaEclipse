package com.kosta.exam03;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetTest {
	public static void main(String[] args) {
		Set data = new LinkedHashSet();
		data.add("된장찌개");
		data.add("백반");
		data.add("짬뽕");
		boolean f1 = data.add("김치찌개");
		//짬뽕은 중복이므로 아예 무시됨 성능은  HashSet이 더 좋음 순서가 필요할 때만 LinkedHashSet사용 
		
		boolean f2 = data.add("짬뽕");
		
		//set은 중복을 허용하지 않음 
		System.out.println(data);

		System.out.println(f1);
		System.out.println(f2);
	}	
}


//순서 + 정렬까지가 TreeSet 