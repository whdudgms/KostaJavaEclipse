package com.kosta.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ShowOrders 
{
	
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt =null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("고객의 이름을 입력해주세요.");
		String name  = sc.next();
		String sql  = ""
				+ "";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url  = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "c##madang";
		String password = "madang";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
			stmt = conn.createStatement();
			
			stmt.executeQuery(sql);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
