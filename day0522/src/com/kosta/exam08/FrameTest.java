package com.kosta.exam08;

import java.awt.Frame;


// 갑자기 오류가 사라짐 
public class FrameTest  {
	public static void main(String[] args) {
		
		// 메모리에만 일단 창 만들어짐
		Frame f = new Frame("**우리반** ");
		System.out.println("창을 만들었어요");
		
		//크기를 설정
		f.setSize(400, 300);

		//창이 눈에 보이게 만들어준다. 
	    f.setVisible(true);

        // 창 닫기 기능 추가
        f.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        
        
	}
}
