package COM.ex0517.ex;

import java.sql.*;

public class Answer4 {
	String connect ="jdbc:oracle:thin:@localhost:1521:xe";
	String user = "SCOTT";
	String passwd = "TIGER";
	Connection conn;
	PreparedStatement pstmt;
	
	public Answer4() {
		try {
			conn = DriverManager.getConnection(connect, user, passwd);
			
			String query = "DELETE FROM DEPT WHERE DEPTNO=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, 40);
			
			
			int i = pstmt.executeUpdate();
			
			if(i>0) {
				System.out.println("정상적으로 삭제 되었습니다.");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
			
		}
	}
	public static void main(String[] args) {
		new Answer4();
	}

}
