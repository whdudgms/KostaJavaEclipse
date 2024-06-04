package com.kosta.exam01;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Cafe extends JFrame{
	
	JRadioButton[] radioButton = new JRadioButton[3];


	
	public Cafe() {
		setLayout(new GridLayout(3,2));
		
		radioButton[0] = new JRadioButton("3000");
		radioButton[1]  = new JRadioButton("4000");
		radioButton[2]  = new JRadioButton("5000");
	
		
		for(int i = 0; i < radioButton.length; i++) {
			add(radioButton[i]);
			radioButton[i].setBounds(100, 150, 100, 30);
			radioButton[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for(int i = 0; i < radioButton.length; i++ ) {
						radioButton[i].setSelected(false);
					}
					((JRadioButton)e.getSource()).setSelected(true);
				}
			});
		}
		
		
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
	}
	
	public static void main(String[] args) {
		new Cafe();
	}

}
