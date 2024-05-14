package com.kosta.exam;

public class D22MethodEqualsArray {
	
	public static boolean equalsArr(int[] a, int[] b){
		boolean flag = true;
		
		
		if(a.length != b.length) 
			return (flag = false);
		
		for(int i = 0; i < a.length; i++) {
			if(a[i]!=b[i]) {
				return false;
			}
		}
		return flag;
	}
	
	public static void main(String[] args){
		int[] ar1 = {1,2,3};
		int[] ar2 = {1,2,3};
		System.out.println(equalsArr(ar1,ar2));
	}

}