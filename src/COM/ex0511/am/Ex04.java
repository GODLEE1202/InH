package COM.ex0511.am;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
	String connect ="jdbc:oracle:thin:@localhost:1521:xe";
	String user = "SCOTT";
	String passwd = "TIGER";
	Connection conn;
	Statement stmt;
	Statement stmt2;
	PreparedStatement pstmt;
	ResultSet rs;
	
	
	public Ex04() {
		try {
			conn = DriverManager.getConnection(connect, user, passwd);
			
			String query = "INSERT INTO bonus values(?, ? , ? , null)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "LIH");
			pstmt.setString(2, "programer");
			pstmt.setInt(3, 3000);
			
			int i = pstmt.executeUpdate();
			//executeUpdate가 반환하는 정수값은 몇개의 ROW가 수정, 삭제, 삽입 되었는지 알려주는 카운트값
			
			
			if(i>0) {
				System.out.println("정상적으로 삽입이 되었습니다.ㅈ");
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		new Ex04();
	}

}
