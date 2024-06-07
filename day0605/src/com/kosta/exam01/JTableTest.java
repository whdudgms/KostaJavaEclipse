package com.kosta.exam01;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame {
	
	JTable table;
	
	public JTableTest() {
		String[] colNames = {"이름","국어","영어","수학"};
		String[][] rowData = {
				{"홍석영","80","56","23"},
				{"임유나","23","45","67"},
				{"유요한","67","78","89"}
		};
		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);
		add(jsp);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new JTableTest();
		}
}
