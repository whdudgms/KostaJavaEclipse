package com.kosta.exam01;

class NotFoundException extends Exception{
	public NotFoundException(String message) {
		super(message);
	}
	public NotFoundException() {
		super();
	}
}

class SearchArray{
	public static boolean searchIrr(int[] a, int b) throws NotFoundException{
		boolean flag =false;
		for(int i =0; i < a.length; i++) {
			if(a[i] == b) {
				System.out.println("찾고자 하는  value  " +(i +1)+"번째에 있습니다.");
				flag=true;
			}
		}
		if(flag == false) {
			throw new NotFoundException();
		}
		return flag;
	}
}

public class SearchArrayTest {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int b = 3;
		int c = 4;
		try {
			SearchArray.searchIrr(a, b);
			SearchArray.searchIrr(a, c);
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
	}
}
