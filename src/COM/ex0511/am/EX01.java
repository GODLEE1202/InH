package COM.ex0511.am;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EX01 {
	String connect ="jdbc:oracle:thin:@localhost:1521:xe";
	String user = "SCOTT";
	String passwd = "TIGER";
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	
	public EX01() {
		
		try {
			
			//0.Driver등록
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//ojdbc6.jar 파일을  Referenced Libraries에 등록을 해서 Driver등록 문을 생략해도됨
			
			//1. connection 얻기
			conn = DriverManager.getConnection(connect, user, passwd);
			
			//2. STATEMENT 얻기
			stmt = (Statement)conn.createStatement();
			String query = "select * from emp";
			
			//3. 쿼리 실행 후 결과 얻기
			rs = stmt.executeQuery(query);
			
			//4.결과 처리
			while(rs.next()) {
//				int empno = rs.getInt(1);
//				String ename = rs.getString(2);
//				String job = rs.getString(3);
				int empno = rs.getInt("EMPNO");
				String ename = rs.getString("ENAME");
				String job = rs.getString("JOB");
				System.out.println(empno + " : "+ ename + " : " + job);
			}
					
					
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
				
			} catch (Exception e2) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	public static void main(String[] args) {
		new EX01();
		
	}
	
	
}
