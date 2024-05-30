package com.kosta.exam09;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	JButton button01;
	JButton button02;
	
	public MyFrame() {
		
		button01 = new JButton("남자");
		button02 = new JButton("여자");

		button01.setSize(50, 50);
		button02.setSize(50, 50);
		button01.setLocation(0,0);
		button01.setLocation(50,50);
		add(button01);
		add(button02);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MyFrame();
		
	}
}
