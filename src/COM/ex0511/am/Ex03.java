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
			//-- 1. EMP 테이블에서 부서 인원이 4명보다 많은 부서의 부서번호, 인원수, 급여의 합을 출력하라.
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
			//-- 2. EMP 테이블에서 가장 많은 사원이 속해있는 부서번호와 사원수를 출력하라.
			
			stmt = (Statement)conn.createStatement();
			String query2 = "select deptno, count(*) cnt "+"from emp "+"group by deptno "+"having count(*) = (select max(count(*)) from emp group by deptno)";
			
			rs = stmt.executeQuery(query2);
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				int cnt = rs.getInt("cnt");
				System.out.println("부서번호 : "+ deptno + " 사원수 : " + cnt);
			}
			System.out.println();
			
			
			//-- 3. EMP 테이블에서 가장 많은 사원을 갖는 MGR의 사원번호를 출력하라.
			stmt2 = (Statement)conn.createStatement();
			String query4 = "select mgr from emp group by mgr having count(mgr) = (select max(count(*)) from emp group by mgr)";
			
			rs = stmt2.executeQuery(query4);
			while(rs.next()) {
				int mgr = rs.getInt("mgr");
				System.out.println("가장 많은 사원을 갖는 MGR의 사원번호 : "+ mgr);
			}
			
			System.out.println();
			
			//3 EMP 테이블에서 사원번호가 7521인 사원의 직업과 같고 사원번호가 7934인 사원의 급여(SAL)보다 많은 사원의 사원번호, 이름, 직업, 급여를 출력하라.
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
				System.out.println("사원번호 : " + deptno + " 이름 : "+ename+ " 직업 : "+ job + " 급여 : "+sal);
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
