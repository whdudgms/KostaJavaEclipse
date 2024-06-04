package com.kosta.exam01;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarCenter extends JFrame{
	
	JCheckBox[] jCheckBox = new JCheckBox[4];
	JLabel[] jLabel = new JLabel[4];
	JLabel status = new JLabel();
	
	
	public void getPrice() {
		int sum = 0;
		for(int i =0; i < jCheckBox.length; i++) {
			if(jCheckBox[i].isSelected()) {
				sum += Integer.parseInt(jCheckBox[i].getText());
			}
		}
		status.setText(sum+"");
	}
	public CarCenter() {
		setLayout(new GridLayout(5,2));
		
		jLabel[0] = new JLabel("엔진 오일 교환");
		jCheckBox[0] = new JCheckBox("45000");
		
		jLabel[1] = new JLabel("자동 변속기 오일 교환");
		jCheckBox[1] = new JCheckBox("80000");
		
		jLabel[2] = new JLabel("에어콘 필터 교환");
		jCheckBox[2] = new JCheckBox("30000");
		
		jLabel[3] = new JLabel("타이어 교환");
		jCheckBox[3] = new JCheckBox("100000");
		
		
		for(int i =0; i < jLabel.length; i++) {
			add(jLabel[i]);
			add(jCheckBox[i]);
			
			jCheckBox[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					getPrice();
					
				}
			});
		}
		
		add(status);
		
		
		
		
		
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		new CarCenter();
	}
	

}
