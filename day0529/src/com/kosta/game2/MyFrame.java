package com.kosta.game2;

import java.awt.Color;
import java.io.IOException;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyPanel panel;
	public MyFrame() throws IOException {
		setBackground(Color.green);
		panel = new MyPanel();
		add(panel);
		setSize(400,300);
		setVisible(true);
		
		//프레임을 닫으면 프로그램을 종료하도록 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) throws IOException {
		new MyFrame();
	}
}
