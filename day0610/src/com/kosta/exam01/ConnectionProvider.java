package com.kosta.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionProvider {
	
	public static Connection getConnection() {
		Connection conn = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url  = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "c##madang";
		String password = "madang";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	
	
	public static void closeConnection(Connection conn, Statement stmt) {
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
