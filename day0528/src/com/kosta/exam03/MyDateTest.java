package com.kosta.exam03;

import java.util.StringTokenizer;

class MyDate{
	int year;
	int month;
	int day;
	
	int[] date = new int[3];
	
	public MyDate(String str) {
		if(str == null) {
			throw new IllegalArgumentException();
		}
		StringTokenizer st = new StringTokenizer(str,"/");
		int  i= 0;
		while(st.hasMoreElements()) {
			date[i++]=Integer.parseInt(st.nextElement().toString());
		}
		 year = date[0];
		 month = date[1];
		 day = date[2];
	}

	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
	
}

public class MyDateTest {
	public static void main(String[] args) {
		
		MyDate m1 = new MyDate("2023/10/11");
		try {
		MyDate m2 = new MyDate(null);
		}catch(IllegalArgumentException e) {
			System.out.println("null을 입력받음");
			e.printStackTrace();
		}
		System.out.println(m1);
	}

}
