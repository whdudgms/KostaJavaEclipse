package com.kosta.exam03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

/*
  	private int no;
	private String item;
	private int sqt;
	private int price;
	
  */
public class GoodsDAO {
	public static String driver = "oracle.jdbc.driver.OracleDriver";
	public static String url  = "jdbc:oracle:thin:@localhost:1521:XE";
	public static String username = "c##madang";
	public static String password = "madang";
	
	// 새로운 상품을 등록하기 위한 메소드 와꾸를 만들라??
	
	public int insertGoods(GoodsVO g) {
		int re = -1;
		String sql = "insert into goods values("+g.getNo()+",'"+g.getItem()+"',"+g.getSqt()+","+g.getPrice()+")";
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

	
	
	
	
	public static ArrayList<GoodsVO> selectAllGoods() {
		ArrayList<GoodsVO> list = new ArrayList<GoodsVO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from goods";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				boolean b = list.add(new GoodsVO((rs.getInt("NO")),
						rs.getString("ITEM"), rs.getInt("QTY"), rs.getInt("PRICE")   ));
			}
			System.out.println(list.toString());
		
		}catch (Exception e) {
				
		e.printStackTrace();
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
				e.printStackTrace();
			}
		}
		return list;
	}
}
