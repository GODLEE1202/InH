package COM.ex0426.am;

public class Ex05 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("�ȳ��ϼ���");
			
			try {
				Thread.sleep(500);	//�־��� �ð����� �Ͻ� ����(������ millisecond
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}
