package COM.ex0426.am;

public class Thread2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 1000000000; i++) {
			
		}
		try {
			Thread2.sleep(1500);	//1.5�� �Ͻ����� try~catch������ �ؾ���
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		for (int i = 0; i < 1000000000; i++) {
			
		}
	}
}
