package com.kosta.exam;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        
    	// 사주팔자 초기화
        String[] str = 
            {
                    "천귀",
                    "천액",
                    "천권",
                    "천파",
                    "천인",
                    "천문",
                    "천복",
                    "천고",
                    "천역",
                    "천간", 
                    "천수",
                    "천명"    //12개 
            }; 
        
        // 사주 초기화 
        String[] str1 = {"생년","생월","생일","생시"};
        
        Scanner sc = new Scanner(System.in);
        
        
        //전부 숫자로 입력받아서 컨트럴하기 편하게 하자~ 
        //사주팔자의 요소들을 저장할 배열 변수다!!!!!!
        int[] num = new int[4];
        
        //형식을 알려주고 형식에 대한 숫자를 입력받자 
        System.out.println("입력값을 앞에서 말하는 형식에 맞게!!!! 입력해 주세요!");
        System.out.println("무슨 띠니? 약속된 숫자로 입력해주세요 ");
        System.out.println("0: 쥐 \n1: 소 \n2: 범 \n3: 토끼 \n4: 용 \n5: 뱀 \n6: 말 \n7: 양 \n8: 원숭이 \n9: 닭 \n10: 개 \n11: 돼지 ");
        num[0] = sc.nextInt();
        System.out.println("무슨 월이에요?? (단순 숫자만 입력해주세요) ");
        num[1] = sc.nextInt() -1; // -1반드시 해줘야함   !!(1월일 경우 그대로 여야하니까 ^^)!! 
        System.out.println("무슨 일이에요?? (단순 숫자만 입력해주세요) ");
        num[2] = sc.nextInt() -1; // -1 반드시 해줘야함 !!(1일일 경우 그대로 여야하니까 ^^)!!
        System.out.println("몇시에 태어났어요? (약속된 숫자로 입력해주세요) ");
        System.out.println("0: 밤11-1 \n1: 1-3 \n2: 3-5 \n3: 5-7 \n4: 7-9 \n5: 9-11 \n6: 낮11-1 \n7: 1-3 \n8: 3-5 \n9: 5-7 \n10: 7-9 \n11: 9-11 ");
        num[3] = sc.nextInt();

        // 예외처리를 또 해줘야한다 ~~ ^^ 
        // 숫자말고 다른거 입력할 경우.
        // 숫자값의 범위가 이상할 경우. 
        
        
        //cul에다가 누적하면서 총 길이  0~11까지의 값이 유효하므로 %12로 연산해서 출력. 
        int cul = 0;
        for(int i = 0; i < num.length; i++) {
        	cul += num[i];
        	System.out.printf("%d.%s: %s \n",i+1,str1[i],str[cul%12] );
        }
    }
}
