package COM.ex0501.am;

import java.net.InetAddress;

public class Ex01 {
	/*
	 * 포트(port)
	 * TCP나 UDP에서 제공하는 서비스를 구분하기 위한 번호
	 * 각 프로토콜이 서비스에 따라서 제공하기 위한 일종의 통호
	 * 윈도우 명령 프롬프트에서 netstat - an 명령어를 통해 살펴볼 수 있다.
	 * 포트번호는 3가지고 분류된다.
	 * ->0~1023번 : 잘 알려진 포트(well - known port)
	 * 일반적인 서비스가 접근할 수 없으며 각종 기본 서비스를 제공하는 포트이다.
	 * 
	 * ->1024번 ~49151번 : 등록된 포트 (registered port)
	 * 이반적인 어플리케이션 서비스가 등록ㄷ해서 사용할 수 있는 포트
	 * 어플리케이션 사용시 통신을 해야할 경우 해당 포트 중 임의의 포트 하나를 등록해서 사용이 가능하다.
	 * 만약 기존에 해당 포트를 사용하던 어플리케이션이 있을 경우 포트 충돌이 일어나므로 되도록이면 유니크한 포트를 사용해야 한다.
	 * 
	 * ->49152번 ~ 65535번 : 동적 포트(dynamic port)
	 * 어플리케이션 혹은 시스템에서 추가적인 포트가 필요할 때 잠깐 쓸 용도로 동적으로 제공되는 포트
	 * 해당 번호안의 포트는 자유롭게 어플리케이션에서 이용이 가능하다.
	 * 단 기존의 등록 포트와 달리 등록되지 않은 자유롭게 사용이 가능한 포트이므로 임시적으로 통신을 하고자 할 시에 사용이 가능하며
	 * 포트 충돌로 인한 서비스 차단 현상이 발생할수 있기에 해당 포트를 등록포트로 사용하는 것은 비추천
	 * 
	 * ex) http://www.abc.com:4000/      <- 4000이 포트 번호
	 */
	
	public static void main(String[] args) {
	try {
		InetAddress iadrr = InetAddress.getLocalHost();
		System.out.println("호스트 이름 :" + iadrr.getHostName());
		System.out.println("호스트 주소 : "+ iadrr.getHostAddress());
		iadrr = InetAddress.getByName("www.naver.com");
		System.out.println("호스트 이름 :" + iadrr.getHostName());
		System.out.println("호스트 주소 : "+ iadrr.getHostAddress());
		System.out.println();
		InetAddress[] sw = InetAddress.getAllByName("www.naver.com");
		for (InetAddress temp : sw) {
			System.out.println("호스트 이름 :" + temp.getHostName());
			System.out.println("호스트 주소 : "+ temp.getHostAddress());
		}//DNS에 등록된 IP가 복수개일수 있다./접근성을 위해서 IP여러개/ 클라우드컴퓨팅시스템/부하를 줄이고 한서버에 몰리지 않도록.
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
