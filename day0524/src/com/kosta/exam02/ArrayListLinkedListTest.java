package com.kosta.exam02;

import java.util.ArrayList;

public class ArrayListLinkedListTest {
	public static void main(String[] args) {
		ArrayList<String> data;
		data = new ArrayList<String>();
		data.add("사과");
		data.add("수박");
		data.add("딸기");
		System.out.println(data);
		data.add(1,"포도");
		System.out.println(data);
		data.remove(2);
		System.out.println(data);
		//ArrayList는 마치 배열과 같은 메모리 구조  
		// 앞이나 중간 맨 뒤에 데이터를 추가하면 정상적으로 길이가 늘어남  (새로운 배열로만들어진다. 기존 list는 garvager)
		// 현재 사이즈에서 한칸 이상 공백을 두고 추가하려고 하면 에러가 발생함. 
		// ArrayList 중간이나 처음에 데이터를 삭제하거나 추가하면 시간이 오래걸린다. (복사나 새로운 배열만들어서 옮기기 등의 과정 때문에)
		
		
	
	}
}
