package COM.ex0426.am;

public class Ex07 {
	public static void main(String[] args) {
		SumThread sum = new SumThread();
		sum.start();
		
		/*try {
			sum.join();		//.join() �ش� �������� ���Ḧ ��ٸ��� �޼���
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		for (int i = 0; i <1000; i++) {
			System.out.println("���� : " + sum.getSum());	
			
		}
			
		
	}
}
