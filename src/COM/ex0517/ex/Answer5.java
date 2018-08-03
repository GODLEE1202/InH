package COM.ex0517.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Answer5 {
	String connect ="jdbc:oracle:thin:@localhost:1521:xe";
	String user = "SCOTT";
	String passwd = "TIGER";
	Connection conn;
	PreparedStatement pstmt;
	public Answer5() {
		try {
			conn = DriverManager.getConnection(connect, user, passwd);
			conn.setAutoCommit(false);

			String query1 = "insert into bonus values(?,?,?,?)";
			String query2 = "insert into bonus values(?,?,?,?)";
			pstmt = conn.prepareStatement(query1);
			pstmt.setString(1, "KING");//ename
			pstmt.setString(2, "PRESIDENT");//job
			pstmt.setInt(3, 9000);//sal
			pstmt.setInt(4, 200);//comm
			
			int i = pstmt.executeUpdate();
			
			if(i>0) {
				pstmt = conn.prepareStatement(query2);
				pstmt.setString(1, "MARTIN");
				pstmt.setString(2, "SALESMAN");//job
				pstmt.setInt(3, 5000);//sal
				pstmt.setInt(4, 100);//comm
				
				int j = pstmt.executeUpdate();
				if(j>0) {
					//성공적으로 두개의 insert가 되었을시 커밋
					conn.commit();
					System.out.println("성공적으로 커밋 되었음");
					
				}//아닐경우 롤백
				else { 
					conn.rollback();
					System.out.println("롤백함1");
					
				}
				
			}
			else {
				conn.rollback();
				System.out.println("롤백함2");
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("롤백함3");
		}
		finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}

	}
	public static void main(String[] args) {
		new Answer5();
	}

}
