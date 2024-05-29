package com.kosta.game5;

import java.awt.Color;
import java.io.IOException;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	public MyFrame() throws IOException {
		setBackground(Color.green);
		setTitle("My Game");
		add(new MyPanel());
		setSize(500,500);
		setVisible(true);
		//프레임을 닫으면 프로그램을 종료하도록 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) throws IOException {
		new MyFrame();
	}
}


