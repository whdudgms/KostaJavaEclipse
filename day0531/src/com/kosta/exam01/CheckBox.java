package com.kosta.exam01;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBox extends JFrame{
	
	JCheckBox box1;
	JCheckBox box2;
	JLabel status;
	
	JPanel jp1;
	JPanel jp2;
	public CheckBox() {
		setLayout(new FlowLayout());
		box1 = new JCheckBox("사과");
		box2 = new JCheckBox("포도");
		status = new JLabel("상태를 표시할 라벨");
		
		jp1 = new JPanel(new FlowLayout());
		jp2 = new JPanel(new GridLayout(1,1));
		jp2.add(status);
		jp1.add(box1);
		jp1.add(box2);
		add(jp1);
		add(jp2);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		box1.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				if(box1.isSelected() && box2.isSelected()) {
					status.setText("모두 선택입니다.");
				}else if(box1.isSelected()) {
					status.setText("1선택");
				}else if(box2.isSelected()) {
					status.setText("2선택");
				}else {
					status.setText("아무것도 선택하지 않았습니다.");
				}
			}
		});
		
		box2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(box1.isSelected() && box2.isSelected()) {
					status.setText("모두 선택입니다.");
				}else if(box1.isSelected()) {
					status.setText("1선택");
				}else if(box2.isSelected()) {
					status.setText("2선택");
				}else {
					status.setText("아무것도 선택하지 않았습니다.");
				}
			}
		});
	}

	public static void main(String[] args) {
		new CheckBox();
	}
}
