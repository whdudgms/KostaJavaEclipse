package com.kosta.exam;

public class D04ArrayEqualsTest1 {
	
	public static void main(String[] args) {
		

		int[] a = {1, 2, 3, 4, 5};
		int[] b = {1, 2, 3, 4, 5};
		
		boolean flag = true;
		
		if(a.length != b.length){
			flag = false;
		}else{
			for(int i = 0; i < a.length; i++) {
				if(a[i] != b[i]) {
					flag = false;
					break;
				}
			}
		}
		
		if(flag == true) {
			System.out.println("배열 내용이 일치합니다.");
		}else {
			System.out.println("배열 내용이 일치하지 않습니다.");
		}
	}
}
