package COM.ex0501.am;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.Socket;
import java.net.*;
import java.io.*;
public class Ex02 {
	public static void main(String[] args) {
		
		try {
			//1. ������ IP�� ������ ���� ��Ʈ��(10002)�� ���ڷ� �־� socket�� ����
			Socket sock = new Socket("192.168.0.192",10007);
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			//2. ������ �������� ���� InputStream�� OutputStream�� ���Ѵ�.
			OutputStream out = sock.getOutputStream();
			InputStream in = sock.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String line = null;
			System.out.println("�Է� ����");
			
			//3. Ű����κ��� ������ �Է¹���
			while ((line = keyboard.readLine())!=null) {
				if(line.equals("quit"))break;
				pw.println(line);
				pw.flush();
				
			}
			
			String echo = br.readLine();
			System.out.println("�����κ��� ���޹��� ���ڿ�");
			
			
			
//			out.close();
//			in.close();
//			br.close();
//			pw.close();
//			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}
}
