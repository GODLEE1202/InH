package COM.ex0426.pm;

public class Ex02 {
	
	/*
	 * ���� ������
	 * �� ������� ���Ḧ �Բ��ϴ� ������
	 * �� �����尡 ����Ǹ� ���� �����嵵 ���������� ����ȴ�.
	 * �����带 ���󽺷���� ����� ���ؼ��� �������� �޼����� setDeamon(true)�� �̿��Ѵ�. 
	 */
	
	public static void main(String[] args) {
		DeamonThread dt = new DeamonThread();
		dt.setDaemon(true);
		dt.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���� ������ ����");
	}
}
