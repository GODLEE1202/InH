package COM.ex0425.pm;

public class MiniThread extends Thread{
	//�����带 ��ӹ޾Ƽ� ���� ���
	@Override
	public void run() {
		for (int i= 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		
	}
}
