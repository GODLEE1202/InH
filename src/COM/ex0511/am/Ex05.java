package COM.ex0511.am;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex05 {
	String connect ="jdbc:oracle:thin:@localhost:1521:xe";
	String user = "SCOTT";
	String passwd = "TIGER";
	Connection conn;
//	Statement stmt;
//	Statement stmt2;
	PreparedStatement pstmt;
//	ResultSet rs;
	
	public Ex05() {
		//1.KGH����� ������ MANAGER�� �ٲ㺸����.
		//2.KGH�� BONUSTABLE���� �����غ�����.
		try {
			conn = DriverManager.getConnection(connect, user, passwd);
			
			String query = "UPDATE BONUS SET JOB=? WHERE ENAME = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "SALESMAN");
			pstmt.setString(2, "LIH");
			
			int i = pstmt.executeUpdate();
			
			if(i>0) {
				System.out.println("���������� ������ �Ǿ����ϴ�.��");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		new Ex05();

	}

}