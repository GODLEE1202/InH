package COM.ex0424.am;

public class Ex01_anonymous {
	/*
	 * �͸�Ŭ���� (Anonymous Class)
	 * �̸��� ���� ��ȸ�� Ŭ����
	 * �ν��Ͻ� ���� �� �ν��Ͻ��� ������ ���� ���� ����� ����
	 * �� �ϳ��� ��ü�� ��ȸ�� ������ ����� ��� ���� �ν��Ͻ� ��������̴�.
	 * �ν��Ͻ��� �ѹ��� ȣ���ص� ����� ���� ��� ����Ѵ�.
	 *  
	 */
	
	
	int a;
	public Ex01_anonymous() {
		a = 1;
		method1();
	}
	public void method1() {
		
	}
	public void method2(Ex01_anonymous ex01) {
		
	}
	public static void main(String[] args) {
		//Ex01_anonymous ex01 = new Ex01_anonymous();
		new Ex01_anonymous().method1();	//���� �̸��� ����� ���� �ϰ� .method1���� �ѹ��� �����̴ϱ�
		new Ex01_anonymous();
		
		/*Ex01_anonymous ex01 = new Ex01_anonymous();
		new Ex01_anonymous().method2(ex01);
		*/
		
		new Ex01_anonymous().method2(new Ex01_anonymous());
		
	}
}
