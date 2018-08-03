package COM.ex0517.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class Answer2 {
	String connect ="jdbc:oracle:thin:@localhost:1521:xe";
	String user = "SCOTT";
	String passwd = "TIGER";
	Connection conn;
	PreparedStatement pstmt;
	
	public Answer2() {
		try {
			conn = DriverManager.getConnection(connect, user, passwd);
			
			String query = "INSERT INTO dept VALUES(?,?,?)";
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, 50);
			pstmt.setString(2,"PRE");
			pstmt.setString(3,"SEOUL");
			
			int i = pstmt.executeUpdate();
			
			if(i>0) {
				System.out.println("정상적으로 삽입이 되었습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
			
		}
	}
	public static void main(String[] args) {
		new Answer2();
	}
}
