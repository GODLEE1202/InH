package COM.ex0501.am;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Ex03 {
	public void main() throws SocketException {
		
			DatagramSocket ds = new DatagramSocket(10005);
			
			Thread th = new Thread(()->{
				System.out.println("���Ž���");
			try {
				while (true) {
					DatagramPacket packet = new DatagramPacket(new byte[100], 100);
					ds.receive(packet);
					
					String data = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
					System.out.println("���� ���� : " + packet.getSocketAddress()+"/"+data);
					
				}
			} catch (Exception e) {
				System.out.println("��������");
			}
		}
			); 
				try {
					Thread.sleep(20000);
				} catch (Exception e) {
					e.printStackTrace();
				
				
				}
				ds.close();
		}
	
	}

