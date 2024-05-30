package com.kosta.exam11;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayOutButton extends JFrame {
    JButton[] buttons = new JButton[15];

    public FlowLayOutButton() {
        // 배치 관리자를 설정
        // FlowLayout으로 설정
        setLayout(new GridLayout(3,6));
        

        // 버튼 배열 초기화 및 추가
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            add(buttons[i]);
        }

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws Throwable {
        new FlowLayOutButton();
    }
}
