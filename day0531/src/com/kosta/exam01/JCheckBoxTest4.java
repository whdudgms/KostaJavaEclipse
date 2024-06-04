package com.kosta.exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBoxTest4 extends JFrame {
	
	JLabel result;
	String []arr = {"사과","포도","수박","바나나","오렌지"};
	JCheckBox []jcb = new JCheckBox[arr.length];
	
	public void checkedList() {
		String r  = "";
		
		for(int i=0; i<jcb.length; i++) {
			if(jcb[i].isSelected()) {
				r += jcb[i].getText()+ ",";
			}
		}

		if(r.equals("")) {
			r = "선택 해 주세요!";
		}else {
			r = r.substring(0, r.length()-1);		
			r += "를(을) 선택하였습니다.";
		}
		result.setText(r);
	}
	
	public JCheckBoxTest4() {
		setLayout(new FlowLayout());
		
		for(int i=0; i<arr.length; i++) {
			jcb[i] = new JCheckBox(arr[i]);
			add(jcb[i]);
			jcb[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					checkedList();
				}
			});
		}
		
		result = new JLabel("선택 해 주세요!"); 
		add(result);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new JCheckBoxTest4();
	}
}