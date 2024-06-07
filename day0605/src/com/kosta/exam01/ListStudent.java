package com.kosta.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListStudent {
	public static void main(String[] args){
	Connection conn = null;
	Statement stmt = null ;
		String sql = "select * from student";
		
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
				System.out.println(name+", "+kor+", "+eng+", "+math);
			}
			
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}finally {
			
			
			try {
			if(stmt != null) {
					stmt.close();
			}
			
			if(conn != null) {
					stmt.close();
				} 
			}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		}
		
	}


