package com.kosta.game;

import java.io.IOException;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyPanel panel;
	public MyFrame() throws IOException {
		panel = new MyPanel();
		add(panel);
		setSize(400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) throws IOException {
		new MyFrame();
	}
}
