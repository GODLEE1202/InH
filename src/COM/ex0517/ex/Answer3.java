package COM.ex0517.ex;

import java.sql.*;

public class Answer3 {
	String connect ="jdbc:oracle:thin:@localhost:1521:xe";
	String user = "SCOTT";
	String passwd = "TIGER";
	Connection conn;
	PreparedStatement pstmt;
	
	public Answer3() {
		try {
			conn = DriverManager.getConnection(connect, user, passwd);
			
			String query = "UPDATE EMP SET sal = ? WHERE ename=?";
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, 500);
			pstmt.setString(2,"MARTIN");
			
			int i = pstmt.executeUpdate();
			
			System.out.println(i+"aaaaa");
			
			if(i > 0) {
				System.out.println("정상적으로 업데이트가 되었습니다.");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}	
	public static void main(String[] args) {
		new Answer3();
	}

}
