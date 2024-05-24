package com.kosta.exam04;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList list  = new ArrayList();

		list.add("된장찌개");
		list.add("돈까스");
		list.add("냉면");
		list.add("돈까스");
		list.add("냉면");
		list.add(1000);
		
		System.out.println(list);
		//list는 
		String food = (String)list.get(1);
		int in = (int)list.get(5);
	}
}
