package COM.ex0501.am;

import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class Ex04 {
	public static void main(String[] args) {
		SocketChannel sc = null;
		
		try {
			sc = SocketChannel.open();
			sc.configureBlocking(true);
			System.out.println("연결 요청");
			sc.connect(new InetSocketAddress("192.168.0.192", 10009));
			System.out.println("연결성공");
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(sc.isOpen()) {
				try {
					sc.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
}
