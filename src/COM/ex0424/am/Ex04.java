package COM.ex0424.am;

public class Ex04 {

	/*
	 * Ÿ�� Ÿ�԰� �Լ��� �������̽�
	 * ���ٽĿ� ���̴� �������̽��� �Լ��� �������̽��� ����Ѵ�.
	 * �׷��� ���ٽĿ� ���̴� �������̽��� ����� ���ʿ��� FunctionalInterface��� ������̼��� �ɾ� �޼��峪 �ٸ� ��ɿ� ������ �ɵ��� �Ѵ�.
	 * ���ٽ��� ���Ե� �������̽��� ������ ���� �ۼ����� �޶����� ������ ���ٽ��� ���Ե� �������̽��� ���ٽ��� Ÿ�� Ÿ���̶�� �Ѵ�.
	 * 
	 */
	
	public static void main(String[] args) {
		Interface2 inter2 = new Interface2() {
			
			/*@Override
			public void method2() {
				
				
			}*/
			
			@Override
			public void method1() {
				
				
			}
		};//��ϸӽ� Ŭ���� ���
		
		Interface2 inter3 = ()->{	//���ٽ��� �ҋ��� �������̽��� �޼ҵ尡 1������ �Ѵ�. 2���� ������ ��
			
		}
		
		
		
	}

}
