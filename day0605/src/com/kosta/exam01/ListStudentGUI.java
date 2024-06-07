package com.kosta.exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ListStudentGUI extends JFrame {
	JTextArea jta;
	public ListStudentGUI() {
		String sql  = "select * from student";
		
		
		jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton btnRead = new JButton("읽어오기");
		
		p.add(btnRead);
		
		add(jsp,BorderLayout.CENTER);
		add(p,BorderLayout.SOUTH);
		
		btnRead.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn 
					= DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:XE",
							"c##madang",
							"madang"
							);
					stmt = conn.createStatement();
					
					
					ResultSet rs= stmt.executeQuery(sql);
					while(rs.next()) {
						String name = rs.getString("name");
						int kor = rs.getInt("kor");
						int eng = rs.getInt("eng");
						int math = rs.getInt("math");
						jta.append(name);
						jta.append(", "+kor);
						jta.append(", "+eng);
						jta.append(", "+math);
						jta.append("\n");
					}


				}catch (Exception e1) {
					System.out.println("예외발생 :" + e1.getMessage());
				}finally {
					
					try {
						if(stmt != null) {
								stmt.close();
						}
						
						if(conn != null) {
								stmt.close();
							} 
						}catch (SQLException e12) {
								// TODO Auto-generated catch block
								e12.printStackTrace();
							}	
					
				}
				
			}
		});
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ListStudentGUI();
	}
}
