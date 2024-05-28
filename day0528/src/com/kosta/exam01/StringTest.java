package com.kosta.exam01;

//원래 String은 참조 자료형입니다.
// 따라서 new String() 처럼 사용해야 해요.
// 그러나 문자열은 다른 것들 보다 훨씬 더 많이 사용하는 참조자료형 이기 때문에
// 마치 기본 자료형 처럼 쓰는 것을 허용해요.
// String data =  new String("Hello");
// String data = "hello";
public class StringTest {
	 public static void main(String[] args) {
	        // StringBuffer 생성
	        StringBuffer sb = new StringBuffer("Hello");

	        // append() 메서드 사용
	        sb.append(" World");
	        System.out.println(sb.toString()); // Output: Hello World

	        // insert() 메서드 사용
	        sb.insert(6, "Beautiful ");
	        System.out.println(sb.toString()); // Output: Hello Beautiful World

	        // replace() 메서드 사용
	        sb.replace(6, 15, "Java");
	        System.out.println(sb.toString()); // Output: Hello Java World

	        // delete() 메서드 사용
	        sb.delete(5, 10);
	        System.out.println(sb.toString()); // Output: Hello World

	        // deleteCharAt() 메서드 사용
	        sb.deleteCharAt(5);
	        System.out.println(sb.toString()); // Output: HelloWorld

	        // reverse() 메서드 사용
	        sb.reverse();
	        System.out.println(sb.toString()); // Output: dlroWolleH

	        // capacity() 메서드 사용
	        System.out.println(sb.capacity()); // 현재 용량 출력

	        // ensureCapacity() 메서드 사용
	        sb.ensureCapacity(50);
	        System.out.println(sb.capacity()); // 용량을 50으로 확장

	        // length() 메서드 사용
	        System.out.println(sb.length()); // 현재 문자열 길이 출력
	    }

}
