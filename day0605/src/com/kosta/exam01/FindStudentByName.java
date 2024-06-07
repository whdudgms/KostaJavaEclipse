package com.kosta.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

// 사용자한테 이름을 입력받아서 
// 그 이름에 해당하는 학생의 정보를 조회하여 출력하는 프로그램 작성 

public class FindStudentByName {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요");
		String name = sc.next();
		
		
		System.out.println(name);
		String sql = "select * from student where name = '"+name+"'";
		
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
				String nam = rs.getString("name");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				int math = rs.getInt("math");
				System.out.print(nam);
				System.out.print(", "+kor);
				System.out.print(", "+eng);
				System.out.print(", "+math);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(stmt != null) {
					stmt.close();
				}
				if(conn != null) {
						conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
