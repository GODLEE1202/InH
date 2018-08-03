package COM.ex0514.AddressBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressBook {
	String connect ="jdbc:oracle:thin:@localhost:1521:xe";
	String user = "test";
	String passwd = "1234";
	Connection conn;
	Statement stmt;
	ResultSet rs;

	public AddressBook() {
		try {
			//1. ����
			conn = DriverManager.getConnection(connect, user, passwd);
			conn.setAutoCommit(false);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e2) {
				
			}
		}
	}

	public static void main(String[] args) {
		new AddressBook();
		
	}
	public void viewAddress() {
		try {
			
			//2. ���� �ۼ�
			stmt = (Statement)conn.createStatement();
			
			String query = "select * from ADDRESSBOOK";

			//3. ���� ���� �� ��� ���
			rs = stmt.executeQuery(query);
			
			//4.��� ó��
			while(rs.next()) {
				String name = rs.getString("NAME");
				String pnumber = rs.getString("PNUMBER");
				String email = rs.getString("EMAIL");
				String address = rs.getString("ADDRESS");
				String birth = rs.getString("BIRTH");
				System.out.println("�̸� : " + name + " , "+"�ڵ��� ��ȣ : "+ pnumber + " , " +"�̸��� : "+ email + " , " +"�ּ� : "+ address+ " , " +"���� : "+ birth);
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}	finally {
			try {
				rs.close();
				stmt.close();		
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public void insertAddress() {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
	}
	public void modifyAddress() {
		
	}


}
