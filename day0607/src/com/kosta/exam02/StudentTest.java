package com.kosta.exam02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class StudentTest extends JFrame {
	JTextField jtf_name;
	JTextField jtf_kor;
	JTextField jtf_eng;
	JTextField jtf_math;
	
	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	JTable table;
	
	// 모든 학생의 목록을 읽어와서 JTable에 출력하는 메소드
	public void loadStudent() {
		rowData.clear();
		StudentDAO dao  = new StudentDAO();
		ArrayList<StudentVO> list =  dao.listStudent();
		for(StudentVO s : list) {
			Vector<String> row = new Vector<String>();
			row.add(s.getName());
			row.add(s.getKor()+"");
			row.add(s.getEng()+"");
			row.add(s.getMath()+"");
			rowData.add(row);
		}
		table.updateUI();
	}
	
	public StudentTest() {
		jtf_name = new JTextField(10);
		jtf_kor = new JTextField(5);
		jtf_eng = new JTextField(5);
		jtf_math = new JTextField(5);
		
		JPanel p= new JPanel();
		
		p.add(new JLabel("이름"));
		p.add(jtf_name);
		p.add(new JLabel("국어"));
		p.add(jtf_kor);
		p.add(new JLabel("영어"));
		p.add(jtf_eng);
		p.add(new JLabel("수학"));
		p.add(jtf_math);
		
		JButton btnAdd= new JButton("등록");
		JButton btnUpdate= new JButton("수정");
		JButton btnDelete= new JButton("삭제");
		
		p.add(btnAdd);
		p.add(btnUpdate);
		p.add(btnDelete);
		
		colNames = new Vector<String>();
		colNames.add("이름");
		colNames.add("국어");
		colNames.add("영어");
		colNames.add("수학");		
		rowData = new Vector<Vector<String>>();		
		table = new JTable(rowData, colNames);
		JScrollPane jsp= new JScrollPane(table);
		
		add(p, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);		
		loadStudent() ;

		setSize(650, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = jtf_name.getText();
				int kor  = Integer.parseInt(jtf_kor.getText());
				int eng  = Integer.parseInt(jtf_eng.getText());
				int math  = Integer.parseInt(jtf_math.getText());
				
				StudentVO s = new StudentVO(name, kor, eng, math);
				StudentDAO dao = new StudentDAO();
				int re = dao.insertStudent(s);
				if(re == 1) {
					JOptionPane.showMessageDialog(null, "학생의 정보를 추가하였습니다.");
					loadStudent();
				}else {
					JOptionPane.showMessageDialog(null, "학생의 정보 추가에 실패하였습니다.");
				}
			}
		});
		
		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = jtf_name.getText();
				int kor  = Integer.parseInt(jtf_kor.getText());
				int eng  = Integer.parseInt(jtf_eng.getText());
				int math  = Integer.parseInt(jtf_math.getText());
				
				StudentVO s = new StudentVO(name, kor, eng, math);
				System.out.println(s);
				StudentDAO dao = new StudentDAO();
				int re = dao.updateStudent(s);
				if(re > 1) {
					JOptionPane.showMessageDialog(null, "학생의 정보를 수정하였습니다.");
					loadStudent();
				}else {
					JOptionPane.showMessageDialog(null, "학생의 정보 수정실패하였습니다.");
				}
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = jtf_name.getText();
				StudentDAO dao = new StudentDAO();
				int re = dao.deleteStudent(name);
				if(re > 0){
					JOptionPane.showMessageDialog(null, "학생의 정보를 삭제하였습니다.");
					loadStudent();
				}else {
					JOptionPane.showMessageDialog(null, "학생의 정보를 삭제에 실패하였습니다.");
				}
			}
		});
		
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// JTable에서 마우스를 눌렀다가 떼어지면 선택한 행의 인덱스를 갖고 온다.
				int idx = table.getSelectedRow();
				
				// JTable의 데이터를 갖고있는 rowData로 부터 선택한 행의 정보를 갖고 온다.
				Vector<String> row = rowData.get(idx);
				
				// 갖고온 벡터로 부터 이름을 뽑아 온다.
				String search = row.get(0);
				String search1 = row.get(1);
				String search2 = row.get(2);
				String search3 = row.get(3);
				
				// 데이터베이스 테이블 student로 부터 선택한 학생의 이름에 해당하는 
				// 레코드를 조회하기 위한 데이터베이스 명령어를 만든다.
				jtf_name.setText(search);
				jtf_kor.setText(search1);
				jtf_eng.setText(search2);
				jtf_math.setText(search3);
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
		
	}
	
	public static void main(String[] args) {	
		new StudentTest();
	}

}