package com.kosta.exam01;

import java.util.Scanner;

public class CheckJumin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("주민번호 입력해주세요 (예: 123456-1234567):");
        String ju = sc.next();

        // 입력값의 길이와 형식을 확인
        if (!ju.matches("\\d{6}-\\d{7}") && !ju.matches("\\d{13}")) {
            System.out.println("올바른 형식의 주민등록번호를 입력해주세요.");
            return;
        }

        // '-' 기호가 있으면 제거
        ju = ju.replace("-", "");
        
        int[] jumin = new int[13];
        for (int i = 0; i < ju.length(); i++) {
            jumin[i] = ju.charAt(i) - '0'; // 문자 '0'의 ASCII 값을 빼서 숫자로 변환
        }

        int checkDigit = calculateCheckDigit(jumin);
        System.out.println(checkDigit);
        if (jumin[12] == checkDigit) {
            System.out.println("올바른 주민등록번호입니다.");
        } else {
            System.out.println("올바르지 않은 주민등록번호입니다.");
        }
    }

    private static int calculateCheckDigit(int[] jumin) {
        int sum = (2 * jumin[0] + 3 * jumin[1] + 4 * jumin[2] + 5 * jumin[3] + 6 * jumin[4] + 7 * jumin[5]
                + 8 * jumin[6] + 9 * jumin[7] + 2 * jumin[8] + 3 * jumin[9] + 4 * jumin[10] + 5 * jumin[11]) % 11;
        return (11 - sum) % 10;
    }
}