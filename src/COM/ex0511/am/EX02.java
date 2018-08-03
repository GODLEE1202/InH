package COM.ex0511.am;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Statement;
import java.sql.Date;
//import java.util.Date;
public class EX02 {
	String connect ="jdbc:oracle:thin:@localhost:1521:xe";
	String user = "SCOTT";
	String passwd = "TIGER";
	Connection conn;
//	Statement stmt;
	PreparedStatement pstmt; //�������̽�
	
	ResultSet rs;
	
	public EX02() {
		try {
			conn = DriverManager.getConnection(connect, user, passwd);
			//String query = "select * from emp where deptno = ?";
			String query = "select * from emp where job in(?,?)";
			pstmt = conn.prepareStatement(query);
			//pstmt.setInt(1, 20);// 1��° ���ڴ� �������ȿ� ?�� �ڸ��� 2��° ���ڴ� ��
			pstmt.setString(1, "ANALYST");
			pstmt.setString(2, "CLERK");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int empno = rs.getInt("EMPNO");
				String ename = rs.getString("ENAME");
				String job = rs.getString("JOB");
				int mgr = rs.getInt("MGR");
				Date hiredate = rs.getDate("HIREDATE");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				
				
				
				System.out.println(empno + " : "+ ename + " : " + job+ " : "+ mgr+ " : "+ hiredate+ " : "+ sal+ " : "+ comm + " : " + deptno);
			}
			//1. date Type �񱳹�: date�� ���� �־� ����.
			//2. date Type�� ���� ���ڿ��� ��ȯ���Ѽ� ���ϰų� �־ ���� ��찡 ����.
			
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();	
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		new EX02();
	}

}
