package COM.ex0501.am;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.Socket;
import java.net.*;
import java.io.*;
public class Ex02 {
	public static void main(String[] args) {
		
		try {
			//1. 서버의 IP와 서버의 동적 포트값(10002)을 인자로 넣어 socket을 생성
			Socket sock = new Socket("192.168.0.192",10007);
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			//2. 생성한 소켓으로 부터 InputStream과 OutputStream을 구한다.
			OutputStream out = sock.getOutputStream();
			InputStream in = sock.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String line = null;
			System.out.println("입력 시작");
			
			//3. 키보드로부터 한줄을 입력받음
			while ((line = keyboard.readLine())!=null) {
				if(line.equals("quit"))break;
				pw.println(line);
				pw.flush();
				
			}
			
			String echo = br.readLine();
			System.out.println("서버로부터 전달받은 문자열");
			
			
			
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
