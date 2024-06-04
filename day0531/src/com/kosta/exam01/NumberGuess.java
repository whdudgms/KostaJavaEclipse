package com.kosta.exam01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NumberGuess extends JFrame{

	JTextField jtf_input;
	JLabel jlb_result;
	JLabel jlb_cnt;
	
	int com;
	int user;
	int cnt ;
	
		public NumberGuess() {
			
		cnt = 0;
			
		com = (int)(Math.random() *100) +1;
		
		setTitle("숫자게임");
		setLayout(new FlowLayout());
		jtf_input = new JTextField(10);
		add(new JLabel("숫자를 추출하시오."));
		add(jtf_input);
		jlb_result = new JLabel("여기에 결과가 나옵니다..");
		jlb_cnt = new JLabel();
		add(jlb_result);
		add(jlb_cnt);
		
		getContentPane().setBackground(Color.pink);
		jlb_result.setBackground(Color.pink);

		jtf_input.setBackground(Color.yellow);
		
		JButton btnOk = new JButton("  다시 한번  ");
		btnOk.setBackground(Color.green);
		JButton btnExit = new JButton("  종료  ");
		btnExit.setBackground(Color.green);
		

		
		add(btnOk);
		add(btnExit);
		
		setSize(250,150);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlb_result.setOpaque(true);
		
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt++;
				jlb_cnt.setText(cnt + "번째 시도");
				user = Integer.parseInt( jtf_input.getText());
				System.out.println(user);
				System.out.println(com);
				
				if(user > com) {
					jlb_result.setText("!-너무 높습니다.-!");
					jlb_result.setBackground(Color.red);

				}else if (user < com) {
					jlb_result.setText("!-너무 낮습니다.-!");
					jlb_result.setBackground(Color.red);

				}else {
					jlb_result.setBackground(Color.blue);

					jlb_result.setText("!-축하 정답입니다.-!");
				}
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
	
	public static void main(String[] args) {
		new NumberGuess();
	}
}
