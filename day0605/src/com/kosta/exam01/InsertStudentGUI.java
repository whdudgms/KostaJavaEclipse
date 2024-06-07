package com.kosta.exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

//학생의 이름, 국어, 영어 수학을 입력받아
//student 테이블에 정보를 추가하는 프로그램을 GUI로 작성합니다.
//화면구성및 변수명등은 자유롭게 합니다.
public class InsertStudentGUI extends JFrame {
	
	
	public static final String driver = "oracle.jdbc.driver.OracleDriver";
	public static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	public static final String userName = "c##madang";
	public static final String password = "madang";
	String name;
	int kor;
	int eng;
	int math;
	JTextField jtf_name;
	JTextField jtf_kor;
	JTextField jtf_eng;
	JTextField jtf_math;
	JButton jbt;
	Connection conn=null;
	Statement stmt=null;
	public InsertStudentGUI() {
		setLayout(new GridLayout(8,2));
		
		jtf_name = new JTextField();
		jtf_kor = new JTextField();
		jtf_eng = new JTextField();
		jtf_math = new JTextField();
		jbt = new JButton("등록");
		
		add(new JLabel("이름"));
		add(jtf_name);
		add(new JLabel("국어"));
		add(jtf_kor);
		add(new JLabel("영어"));
		add(jtf_eng);
		add(new JLabel("수학"));
		add(jtf_math);
		add(jbt);
		String sql = null;
		jbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Connection conn=null;
				Statement stmt=null;	
				name = jtf_name.getText();
				int kor = Integer.parseInt(jtf_kor.getText());
				int eng = Integer.parseInt(jtf_eng.getText());
				int math = Integer.parseInt(jtf_math.getText());
				try {
					String sql = "insert into student values('"+name+"',"+kor+","+eng+","+math+")";
					//1. jdbc드라이버를 메모리로 로드한다.
					System.out.println(1);
					Class.forName("oracle.jdbc.driver.OracleDriver");
					//2. DB서버에 연결한다.
					System.out.println(2);
					String url = "jdbc:oracle:thin:@localhost:1521:XE";
					String username = "c##madang";
					String password = "madang";
					System.out.println(3);
					conn = DriverManager.getConnection(url, username, password);
					//3. 데이터베이스 명령어 실행 담당자 객체를 생성한다.
					stmt = conn.createStatement();
					//4. 명령어 실행 담당자를 통해서 데이터베이스 명령을 실행한다.
					int re = stmt.executeUpdate(sql);
					if(re == 1) {
						System.out.println("레코드 추가 성공");
					}else {
						System.out.println("레코드 추가 실패");
					}
				}catch (Exception e1) {
					System.out.println("예외발생:"+e1.getMessage());
				}finally {
					try {
						if(stmt != null) {
							stmt.close();
						}
						if( conn != null) {
							conn.close();
						}
					}catch (Exception e1) {
						// TODO: handle exception
					}
				}
			}
		});
		setVisible(true);
		setSize(550,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		
		
	}
	public static void main(String[] args) {
		new InsertStudentGUI();
	}
}