package COM.ex0426.am;

public class Ex03 {
	/*
	 * ������ ���� �ֱ�
	 * ������� �¾�鼭 �Ҹ��� �������� ���� �ֱ⸦ ������ ������� �� ���� �ֱ⸶�� ������ ���¸� ������
	 * �׷��� �� ���´� NEW, BUNNALBLE, BLOCKED, WAITING/TIMED+WAITING, TERMINATED��� ���¸� ������.
	 * new: ����ȭ �����Ǿ����� ���� start()�� ���ؼ� ���׵��� �ʴ� ����
	 * RUNNABLE: ���� �� Ȥ�� ���� ������ ����
	 * BLOCKED : ����ȭ ���� ���ؼ� �Ͻ� ������ ����
	 * WAITING : �������� �۾��� ��������� �ʾ����� ���డ������ ���� �Ͻ������� ����
	 * TERMINATED: �������� �۾��� ����� ����
	 */
	public static void main(String[] args) {
		Thread2 th2 = new Thread2();
		
		Thread.State state = th2.getState();
		
		System.out.println(th2.getState());
		
		th2.start();
		System.out.println(th2.getState());
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(th2.getState());
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(th2.getState());
	}
}
