package com.kosta.exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class ListStudentGUI_JTable2 extends JFrame {
	Vector<String> colName;
	Vector<Vector<String>> rowData;
	JTable table;
	
	public ListStudentGUI_JTable2() {
		colName = new Vector<String>();
		colName.add("이름");
		colName.add("국어");
		colName.add("영어");
		colName.add("수학");
		
		rowData = new Vector<Vector<String>>();
		
		table = new JTable(rowData, colName);
		JScrollPane jsp = new JScrollPane(table);
		JPanel p= new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton btnRead = new JButton("읽어오기");
		p.add(btnRead);
		
		add(jsp, BorderLayout.CENTER);
		add(p, BorderLayout.SOUTH);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				int idx = table.getSelectedRow();
				Vector<String> row = rowData.get(idx);
				String search = row.get(0);
				System.out.println(search);
				String sql = "select * from student where name = '"+search+"'";				
				String driver = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:XE";
				String username = "c##madang";
				String password = "madang";
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;				
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url, username, password);
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					
					// 만약 학생의 이름이 중복되지 않는다면 검색결과가 한 건 밖에 없을 것이므로
					// while문 보다는 if문을 사용합니다.
					if(rs.next()) {
						String name = rs.getString(1);
						int kor = rs.getInt(2);
						int eng = rs.getInt(3);
						int math = rs.getInt(4);
						System.out.println(name+","+kor+","+eng+","+math);
					}					
				}catch (Exception ex) {
					System.out.println("예외발생:"+ex.getMessage());
				}finally {
					try {
						if(rs != null) {
							rs.close();
						}
						if(stmt != null) {
							stmt.close();
						}
						if( conn != null) {
							conn.close();
						}
					}catch (Exception ex) {
						// TODO: handle exception
					}
				}
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
		//나머지 코드를 수정하여 결과를 확인 해 봅니다.
		btnRead.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				rowData.clear();
				//벡터를 깨끗이 비운다.
				
				// TODO Auto-generated method stub
				String sql = "select * from student";
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn 
					= DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:XE", 
							"c##madang", 
							"madang");
					stmt = conn.createStatement();			
					rs = stmt.executeQuery(sql);			
					while(rs.next()) {
						String name = rs.getString(1);
						int kor = rs.getInt(2);
						int eng = rs.getInt(3);
						int math = rs.getInt(4);
						Vector<String> row= new Vector<String>();
						row.add(name);
						row.add(kor+"");
						row.add(eng+"");
						row.add(math+"");
						rowData.add(row);
					}	
					table.updateUI();
					
				}catch (Exception ex) {
					System.out.println("예외발생:"+ex.getMessage());
				}finally {
					try {
						if( rs != null) {
							rs.close();
						}
						
						if( stmt != null) {
							stmt.close();
						}
						
						if(conn != null) {
							conn.close();
						}
					}catch (Exception ex) {
						// TODO: handle exception
					}
				}
			}
		});
		
	}
	
	public static void main(String[] args) {
		new ListStudentGUI_JTable2();

	}
}