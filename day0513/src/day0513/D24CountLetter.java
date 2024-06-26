package day0513;

import java.util.Scanner;

public class D24CountLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[26];
		System.out.println("문자열을 입력하시오");
		String buffer = sc.nextLine(); // 알파벳 소문자로만 입력해줘용
		// nextLine : 공백 문자도 입력 가능하다. 
		// ex hello korea  > next()라면 hello만 입력 
		
		// 각 문자가 등장하는 횟수를 계산한다. 
		for(int i= 0; i < buffer.length(); i++) {
			char ch = buffer.charAt(i);
			count[ch - 'a']++;
		}
		
		//배열에 저장된 횟수를 출력하는 반복 루프 
		for(int i= 0; i < count.length; i++) {
			System.out.printf("%c -- > %d \n",(char)('a'+i),count[i]);
			
		}
	}

}
