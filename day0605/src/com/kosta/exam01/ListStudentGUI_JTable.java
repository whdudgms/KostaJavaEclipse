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
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class ListStudentGUI_JTable extends JFrame {
	Vector<String> colName;
	Vector<Vector<String>> rowData;
	JTable table;
	
	public ListStudentGUI_JTable() {
		colName = new Vector<String>();
		colName.add("이름");
		colName.add("국어");
		colName.add("영어");
		colName.add("수학");
		rowData = new Vector<Vector<String>>();
		String sql  = "select * from student";
		table = new JTable(rowData, colName);
		
		JScrollPane jsp = new JScrollPane(table);
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton btnRead = new JButton("읽어오기");
		p.add(btnRead);
		
		add(jsp,BorderLayout.CENTER);
		add(p,BorderLayout.SOUTH);
		
		btnRead.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//rowData = new Vector<Vector<String>>();
				//jta.setText("");
				rowData.clear();
				
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
						
						Vector<String> vt = new Vector<String>();
						vt.add(name);
						vt.add(kor+"");
						vt.add(eng+"");
						vt.add(math+"");
						rowData.add(vt);
					}
					table.updateUI();

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
		new ListStudentGUI_JTable();
	}
}
