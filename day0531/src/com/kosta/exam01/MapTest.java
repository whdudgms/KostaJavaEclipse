package com.kosta.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, String> map
			= new HashMap<String, String>();
		
		map.put("홍석영", "010-1234-5678");
		map.put("임유나", "010-1234-1111");
		map.put("변시우", "010-1234-2222");
		map.put("조영흔", "010-1234-3333");

		//Map의 모든 Key를 가지고 온다.
		Set<String> keyList = map.keySet();
		
		Iterator<String> i = keyList.iterator();

		for(;i.hasNext();) {
			String str = i.next();
			System.out.println(str);
			System.out.println(map.get(str ));
		}
	}
}
