package com.kosta.exam11;


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BoarderLayoutTest extends JFrame{
	
	public BoarderLayoutTest() {
		setLayout(new BorderLayout());
		add(new JButton("위"), BorderLayout.NORTH);
		add(new JButton("아래"), BorderLayout.SOUTH);
		add(new JButton("왼쪽"), BorderLayout.WEST);
		add(new JButton("오른쪽"), BorderLayout.EAST);
		add(new JButton("가운데"), BorderLayout.CENTER);

		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new BoarderLayoutTest();
	}
}
