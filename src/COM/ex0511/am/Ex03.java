package COM.ex0511.am;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	String connect ="jdbc:oracle:thin:@localhost:1521:xe";
	String user = "SCOTT";
	String passwd = "TIGER";
	Connection conn;
	Statement stmt;
	Statement stmt2;
	PreparedStatement pstmt;
	ResultSet rs;
	
	
	public Ex03() {
		try {
			conn = DriverManager.getConnection(connect, user, passwd);
			//-- 1. EMP ���̺��� �μ� �ο��� 4���� ���� �μ��� �μ���ȣ, �ο���, �޿��� ���� ����϶�.
			String query = "select deptno, count(*) cnt, sum(sal) sumsal from emp group by deptno having count(*) > ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, 4);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				int cnt = rs.getInt("cnt");
				int sumsal = rs.getInt("sumsal");
				System.out.println(deptno +" : "+ cnt +" : "+ sumsal);
			}
			System.out.println();
			//-- 2. EMP ���̺��� ���� ���� ����� �����ִ� �μ���ȣ�� ������� ����϶�.
			
			stmt = (Statement)conn.createStatement();
			String query2 = "select deptno, count(*) cnt "+"from emp "+"group by deptno "+"having count(*) = (select max(count(*)) from emp group by deptno)";
			
			rs = stmt.executeQuery(query2);
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				int cnt = rs.getInt("cnt");
				System.out.println("�μ���ȣ : "+ deptno + " ����� : " + cnt);
			}
			System.out.println();
			
			
			//-- 3. EMP ���̺��� ���� ���� ����� ���� MGR�� �����ȣ�� ����϶�.
			stmt2 = (Statement)conn.createStatement();
			String query4 = "select mgr from emp group by mgr having count(mgr) = (select max(count(*)) from emp group by mgr)";
			
			rs = stmt2.executeQuery(query4);
			while(rs.next()) {
				int mgr = rs.getInt("mgr");
				System.out.println("���� ���� ����� ���� MGR�� �����ȣ : "+ mgr);
			}
			
			System.out.println();
			
			//3 EMP ���̺��� �����ȣ�� 7521�� ����� ������ ���� �����ȣ�� 7934�� ����� �޿�(SAL)���� ���� ����� �����ȣ, �̸�, ����, �޿��� ����϶�.
			String query3 = "select deptno, ename, job, sal from emp where job = (select job from emp where empno = ?) and sal > (select sal from emp where empno = ?)";
			pstmt = conn.prepareStatement(query3);
			pstmt.setInt(1, 7521);
			pstmt.setInt(2, 7934);
			rs= pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int sal = rs.getInt("sal");
				System.out.println("�����ȣ : " + deptno + " �̸� : "+ename+ " ���� : "+ job + " �޿� : "+sal);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
				pstmt.close();
				stmt.close();
				rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
	new Ex03();	
	
	}

}
