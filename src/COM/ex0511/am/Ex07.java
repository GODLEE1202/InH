package COM.ex0511.am;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex07 {
	String connect ="jdbc:oracle:thin:@localhost:1521:xe";
	String user = "SCOTT";
	String passwd = "TIGER";
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	
	
	public Ex07() {
		try {
			conn = DriverManager.getConnection(connect, user, passwd);
			//conn.commit();
			//conn.rollback();
			conn.setAutoCommit(false);
			//conn.setSavepoint();
			String sql1 = "insert into dept values(?,?,?)";
			String sql2 = "insert into emp values(?,?,?,null, SYSDATE, ? , null, ?)";
			pstmt = conn.prepareStatement(sql1);
			pstmt.setInt(1, 80);
			pstmt.setString(2, "PMO");
			pstmt.setString(3, "SEOUL");
			int i = pstmt.executeUpdate();
			
			if(i>0) {
				pstmt = conn.prepareStatement(sql2);
				pstmt.setInt(1, 8000);
				pstmt.setString(2, "ABCD");
				pstmt.setString(3, "CLERK");
				
				pstmt.setInt(4, 900);
				pstmt.setInt(5, 50);
				int j = pstmt.executeUpdate();
				if(j>0) {
					//���������� �ΰ��� insert�� �Ǿ����� Ŀ��
					conn.commit();
					System.out.println("���������� Ŀ�� �Ǿ���");
					
				}//�ƴҰ�� �ѹ�
				else { 
					conn.rollback();
					System.out.println("�ѹ���1");
					
				}
				
			}
			else {
				conn.rollback();
				System.out.println("�ѹ���2");
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("�ѹ���3");
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
		new Ex07();

	}

}
