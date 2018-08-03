package COM.ex0501.am;

import java.net.InetAddress;

public class Ex01 {
	/*
	 * ��Ʈ(port)
	 * TCP�� UDP���� �����ϴ� ���񽺸� �����ϱ� ���� ��ȣ
	 * �� ���������� ���񽺿� ���� �����ϱ� ���� ������ ��ȣ
	 * ������ ��� ������Ʈ���� netstat - an ��ɾ ���� ���캼 �� �ִ�.
	 * ��Ʈ��ȣ�� 3������ �з��ȴ�.
	 * ->0~1023�� : �� �˷��� ��Ʈ(well - known port)
	 * �Ϲ����� ���񽺰� ������ �� ������ ���� �⺻ ���񽺸� �����ϴ� ��Ʈ�̴�.
	 * 
	 * ->1024�� ~49151�� : ��ϵ� ��Ʈ (registered port)
	 * �̹����� ���ø����̼� ���񽺰� ��Ϥ��ؼ� ����� �� �ִ� ��Ʈ
	 * ���ø����̼� ���� ����� �ؾ��� ��� �ش� ��Ʈ �� ������ ��Ʈ �ϳ��� ����ؼ� ����� �����ϴ�.
	 * ���� ������ �ش� ��Ʈ�� ����ϴ� ���ø����̼��� ���� ��� ��Ʈ �浹�� �Ͼ�Ƿ� �ǵ����̸� ����ũ�� ��Ʈ�� ����ؾ� �Ѵ�.
	 * 
	 * ->49152�� ~ 65535�� : ���� ��Ʈ(dynamic port)
	 * ���ø����̼� Ȥ�� �ý��ۿ��� �߰����� ��Ʈ�� �ʿ��� �� ��� �� �뵵�� �������� �����Ǵ� ��Ʈ
	 * �ش� ��ȣ���� ��Ʈ�� �����Ӱ� ���ø����̼ǿ��� �̿��� �����ϴ�.
	 * �� ������ ��� ��Ʈ�� �޸� ��ϵ��� ���� �����Ӱ� ����� ������ ��Ʈ�̹Ƿ� �ӽ������� ����� �ϰ��� �� �ÿ� ����� �����ϸ�
	 * ��Ʈ �浹�� ���� ���� ���� ������ �߻��Ҽ� �ֱ⿡ �ش� ��Ʈ�� �����Ʈ�� ����ϴ� ���� ����õ
	 * 
	 * ex) http://www.abc.com:4000/      <- 4000�� ��Ʈ ��ȣ
	 */
	
	public static void main(String[] args) {
	try {
		InetAddress iadrr = InetAddress.getLocalHost();
		System.out.println("ȣ��Ʈ �̸� :" + iadrr.getHostName());
		System.out.println("ȣ��Ʈ �ּ� : "+ iadrr.getHostAddress());
		iadrr = InetAddress.getByName("www.naver.com");
		System.out.println("ȣ��Ʈ �̸� :" + iadrr.getHostName());
		System.out.println("ȣ��Ʈ �ּ� : "+ iadrr.getHostAddress());
		System.out.println();
		InetAddress[] sw = InetAddress.getAllByName("www.naver.com");
		for (InetAddress temp : sw) {
			System.out.println("ȣ��Ʈ �̸� :" + temp.getHostName());
			System.out.println("ȣ��Ʈ �ּ� : "+ temp.getHostAddress());
		}//DNS�� ��ϵ� IP�� �������ϼ� �ִ�./���ټ��� ���ؼ� IP������/ Ŭ������ǻ�ýý���/���ϸ� ���̰� �Ѽ����� ������ �ʵ���.
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
