package com.kosta.exam01;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args){
		String str = "홍석영 임유나 변시아 조영흔 유요한";
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
