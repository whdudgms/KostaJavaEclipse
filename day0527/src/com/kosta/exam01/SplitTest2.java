package com.kosta.exam01;

public class SplitTest2 {
	public static void main(String[] args) {
		String data = "홍석영 임유나 변시우 조영흔 유요한";
		String[] strr = data.split(" ");
		for(String a : strr) {
			System.out.println(a);
		}
	}
}
