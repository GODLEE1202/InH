package COM.ex0424.am;

public class Ex03_Lambda {
	
	public static void main(String[] args) {
		
		/*
		 * ���ٽ�
		 * �ڹ� 1.8���� �����ϱ� ������ ���
		 * ������ �˷м� óġ�� ��ǥ�� ���� �������� ���� ������ �� ��ī�� �� ���α׷��� �� �����Ѱ��� ����
		 * ���ٽ� ���� �ڵ尡 �ſ� ���������� ���� �÷����� ��Ҹ� ���͸� �ϰų� �����ؼ� ���ϴ� ����� ���� ������ �� �ִ�.
		 * ���ٽ��� ����
		 * => ���ٽ��� ���� ���� �Լ��� �������̽��� �ݵ�� 1���� �߻�޼��常�� �����߸� �Ѵ�.
		 */
		
		
		/*
		 * //��ϸӽ� Ŭ���� ���
		  Interface1 inter1 = new Interface1() {
			@Override
			public void method1() {	
				System.out.println("�̰��� �͸����� ������� Ŭ������ �޼��� �Դϴ�");
			}
		};
		inter1.method1();
		
		*/
		 
		 
		
		
		
		//���ٽ� ��� �ڵ� �ټ� �پ��
		Interface1 inter2 = () -> {
			System.out.println("�̰��� �͸����� ������� Ŭ������ �޼����Դϴ�.2222222");
			int a=1;
			int b = 2;
			System.out.println(a+b);
			
		};
		inter2.method1();
		
	
	}
	
}
