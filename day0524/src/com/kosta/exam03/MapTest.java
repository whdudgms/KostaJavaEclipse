package com.kosta.exam03;

import java.util.ArrayList;
import java.util.List;

public class MapTest {
	public static void main(String[] args) {
		// 어떤 사람의 이름,주소,전화를 리스트에 담아 봅니다.
		List<String> data = new ArrayList<String>();
		
		data.add("홍길동");
		data.add("서울시 종로구 종로2가");
		data.add("010-1111-1111");
		
		
		// 위의 코드의 경우 이 사람의 전화번호를 갖고 오려면
		// 전화번호가 1번째 인덱스라는 것을 알아야 합니다.
		// 이것은 때에 따라 헛갈릴 수 있어요. 
		// 각 요소의 데이터를 어떤 의미를 갖고 있을 때에
		// 인덱스로 접근하는 방식 보다는 의미있느 Key로 데이터를 접근하도록 
		// 하는 것이 더 직관적입니다.
		// 이럴떄에 Map 사용하는것이 더 좋음.
	}
}
