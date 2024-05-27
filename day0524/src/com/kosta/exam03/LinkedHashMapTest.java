package com.kosta.exam03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LinkedHashMapTest {
	public static void main(String[] args){
		Map<String,String> data = new LinkedHashMap<String, String>();
		
		data.put("name", "홍길동");
		data.put("addr", "서울시 종로구 종로2가");
		data.put("phone", "010-1234-1234");
		
		String addr = data.get("name");
		System.out.println(addr);
		System.out.println(data);
	}
}
