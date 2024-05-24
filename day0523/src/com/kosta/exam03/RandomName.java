package com.kosta.exam03;

import java.util.Random;

// 난수연습하기
// 
public class RandomName {
	public static void main(String[] args) throws InterruptedException {
		String[] strr = {"변시우","임유나","홍석영","조영흔","유요한","박성빈","김예은",
				"이재원","장동건","최모래","최가은","박규희","유현진","공희상","강동균"};
		
		System.out.println(strr[(int)(Math.random()* strr.length)]);
		
		String name;
		for(int i = 0; i < 100; i++ ) {
			name = strr[(int)(Math.random()* strr.length)];
			Thread.sleep(45 );
			
			System.out.println(name);
		}

			
		
		// >>> 연산 하면 무조건 양수로 바뀐다!
		int a = (int)System.currentTimeMillis()% strr.length;
		int b = new Random().nextInt(strr.length);
	}
}
