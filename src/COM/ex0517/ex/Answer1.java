package COM.ex0517.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Answer1 {
	String connect ="jdbc:oracle:thin:@localhost:1521:xe";
	String user = "SCOTT";
	String passwd = "TIGER";
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public Answer1() {
		try {
			conn = DriverManager.getConnection(connect, user, passwd);
			String query = "Select empno, ename, job from emp";
			pstmt= conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int empno = rs.getInt("EMPNO");
				String ename = rs.getString("ENAME");
				String job = rs.getString("JOB");
				
				System.out.println("EMPNO: "+empno+" ENAME: "+ename+" JOB: "+job);
			}
			
		} catch (Exception e) {
			
		}
	}
	public static void main(String[] args) {
		new Answer1();
	}
	
	
	
}
