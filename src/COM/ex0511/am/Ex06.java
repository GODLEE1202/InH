package COM.ex0511.am;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex06 {
	String connect ="jdbc:oracle:thin:@localhost:1521:xe";
	String user = "SCOTT";
	String passwd = "TIGER";
	Connection conn;
	PreparedStatement pstmt;
	public Ex06() {
		//2.KGH�� BONUSTABLE���� �����غ�����.
	try {
		conn = DriverManager.getConnection(connect, user, passwd);
		
		String query = "delete from BONUS WHERE ENAME = ?";
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, "LIH");
		
		
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
		// TODO Auto-generated method stub

	}

}
