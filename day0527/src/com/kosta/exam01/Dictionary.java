package com.kosta.exam01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        String word, mean;

        while (true) {
            System.out.println("숫자 입력 = > 1 (단어 추가)   2 (단어 검색)   3 (단어 삭제)   0 (종료)");
            int answer = sc.nextInt();
            if (answer == 0) {
                break;
            }
            switch (answer) {
                case 1:
                    System.out.println("추가할 단어를 입력하세요");
                    word = sc.next();
                    if (map.get(word) != null) {
                        System.out.println("이미 존재하는 단어입니다. 덮어쓰시겠습니까?\n 1 (네)  2 (아니요)");
                        int answer2 = sc.nextInt();
                        if (answer2 == 1) {
                            System.out.println("단어의 뜻을 입력하세요");
                            mean = sc.next();
                            map.put(word, mean);
                            System.out.println(word + " 가 등록되었습니다");
                            break;
                        } else if (answer2 == 2) {
                            System.out.println("초기화면으로 돌아갑니다");
                            break;
                        } else {
                            System.out.println("올바른 숫자를 입력하세요");
                            break;
                        }
                    } else {
                        System.out.println("단어의 뜻을 입력하세요");
                        mean = sc.next();
                        map.put(word, mean);
                        System.out.println(word + " 가 등록되었습니다");
                        break;
                    }
                case 2:
                    System.out.println("검색할 단어를 입력하세요");
                    word = sc.next();
                    mean = map.get(word);
                    if (mean == null) {
                        System.out.println("없는 단어 입니다");
                    } else {
                        System.out.println(word + "의 뜻은 " + mean + "입니다");
                    }
                    break;
                case 3:
                    System.out.println("삭제할 단어를 입력하세요");
                    word = sc.next();
                    if (map.get(word) == null) {
                        System.out.println("없는 단어 입니다");
                    } else {
                        map.remove(word);
                        System.out.println(word + "가 삭제되었습니다");
                    }
                    break;
                default:
                    System.out.println("올바른 숫자를 입력하세요");
            }
        }
    }
}