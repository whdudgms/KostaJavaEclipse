package com.kosta.exam03;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//컴퓨터와 사용자가 가위,바위,보 하는 게임을 만들어 봅시다.
// 
public class GameTestMap {
	public static void main(String[] args) throws InterruptedException {
		Map<Integer, String> data = new HashMap<Integer, String>();
		
		data.put(0, "가위");
		data.put(1, "바위");
		data.put(2, "보");
		
		System.out.println(data + " 중 하나를 선택해서 게임을 시작합니다. 게임을 그만두기 99");
		
		System.out.println("\n\n\n*** 가위바위보 게임 ***");
		 Scanner sc = new Scanner(System.in);
		Integer cho;
		Integer computeChoice;
		
		while(true) {
		System.out.println("0:가위  1:바위  2:보  게임 끝내기:99 ");
		cho = sc.nextInt();
		
		if(cho == 99) {
			break;
		}
		
		System.out.println(data.get(cho)+"을(를) 사용자가 냈습니다.");
		Thread.sleep(500);
		computeChoice = (int)(Math.random()*3);
		System.out.println(data.get(computeChoice)+"을(를) 컴퓨터가 냈습니다.");
		if(cho == computeChoice) {
			System.out.println("비김");
		}else if(cho - computeChoice == -1 || cho - computeChoice == 2){
			System.out.println("컴퓨터의 승리");
		}else {
			System.out.println("인간의 승리");
		}
		Thread.sleep(700);
		}
	}
}
