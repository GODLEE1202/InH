package COM.ex0426.pm;

public class Ex01 {
	
	/*
	 * �������� ����ȭ - synchronized
	 * �ѹ��� �ϳ��� �����常 ��ü�� �ڿ��� ������ �� �ֵ��� ������ ��(rock)�� �ɾ 
	 * �������� �ϰ��� �� ���Ἲ�� ������ �� �ְ� ����� ��ɾ�
	 * 
	 * synchronized�� �޼��忡 �ɼ��� ������ ���� �ڵ� ������ {}�� ��� ������ synchronized��ų�� �ִ�.
	 * 
	 * ��, ��, Ȥ�� ��Ʈ��ũ�� ���ؼ� �ټ��� ����ڵ��� ���� �����ϴ� ���α׷��� ��� �� synchronized �� ���� �ʼ������� ���δ�.
	 *  
	 * 
	 */
	
	public static void main(String[] args) {
		Calc calc = new Calc();
		
		User user1 = new User(calc, "user1");
		
		User user2 = new User(calc, "user2");
		
		user1.start();
		
		user2.start();
		
	}
} 
