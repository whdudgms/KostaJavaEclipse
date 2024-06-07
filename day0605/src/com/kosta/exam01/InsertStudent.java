package com.kosta.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class InsertStudent {
	
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;	
		String name;
		int kor,eng,math;
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름-->");
		name = sc.next();
		System.out.print("학생의 국어-->");
		kor = sc.nextInt();
		System.out.print("학생의 영어-->");
		eng = sc.nextInt();
		System.out.print("학생의 수학-->");
		math = sc.nextInt();
		try {
			//김유신,100,100,100
			String sql = "insert into student values('"+name+"',"+kor+","+eng+","+math+")";
			
			//1. jdbc 드라이버를  메모리로 로드한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. DB서버에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String username = "c##madang";
			String password = "madang";
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
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
				if( conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}