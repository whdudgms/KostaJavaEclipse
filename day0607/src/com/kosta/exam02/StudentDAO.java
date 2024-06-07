package com.kosta.exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO {
	public static String driver  = "oracle.jdbc.driver.OracleDriver";
	public static String url  = "jdbc:oracle:thin:@localhost:1521:XE";
	public static String username  = "c##madang";
	public static String password  = "madang";
	
	//모든 학생의 정보를 조회하여 ArrayList로 반환하는 메소드 
	public ArrayList<StudentVO> listStudent(){
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		String sql = "select * from student";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new StudentVO(rs.getString(1),
						rs.getInt(2),
						rs.getInt(3),
						rs.getInt(4)));
			}
			 
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
			
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {

			}
		}
		
		
		return list;
	}
	
	// StudentVO를 매개변수로 전달받고 int를 반환하는 insertStudent 라는 이름의 메소드
	public int insertStudent( StudentVO s  ) {
		int re = -1;
		String sql = "insert into student values('"+s.getName()+"',"+s.getKor()+","+s.getEng()+","+s.getMath()+")";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			re = stmt.executeUpdate(sql);
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {			
			}
		}
		return re;
	}
	
	public int updateStudent( StudentVO s  ) {
		int re = -1;
		String sql = "UPDATE student SET kor =" + s.getKor() + ", eng = " + s.getEng() 
		+ ", math = " 
		+ s.getMath() + " WHERE name = '" + s.getName() + "'";
		Connection conn = null;
		Statement stmt = null;
		try {
			System.out.println(s);
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			re = stmt.executeUpdate(sql);
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {			
			}
		}
		return re;
	}

	public int deleteStudent(String name) {
		int re = -1;
		Connection conn = null;
		Statement stmt = null;
		String sql = "delete student where name = '"+name+"'";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
			stmt = conn.createStatement();
			
			re = stmt.executeUpdate(sql);
		
		}catch (Exception e) {
			try {
				if(stmt != null) {
					stmt.close();
				}
				if(conn != null) {
					conn.close();
				}
				
			}catch (Exception ex) {
				// TODO: handle exception
			}
			
			
		}
		
		
		return re;
	}
	
	
}