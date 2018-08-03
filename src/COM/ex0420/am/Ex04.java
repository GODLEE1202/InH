package COM.ex0420.am;

public class Ex04 {
	/*
	 * ������(polynormal)
	 * �ϳ��� Ÿ������ �������� ��ü�� ������ �ִ� ������ �ǹ�
	 * �ϳ��� �θ�Ÿ���� �̿��ؼ� �������� �ڽ� ��ü�� ������ �� �ִ�.
	 * �θ�Ÿ������ ����� �ڽİ�ü�� �θ�Ÿ���� ������ �޼������ ����� ����� �� ����.
	 * �θ�Ÿ�Կ��� �������� ���� ����� ����ϰ��� �Ҷ��� ��������ȯ�� ���� Ÿ���� �������Ѿ� �Ѵ�.
	 * 
	 */
	public static void main(String[] args) {
		TV tv1 = new TVProduct1();
		TV tv2 = new TVProduct2();
		tv1.turnONOFF();
		tv1.switchChannel();
		tv2.turnONOFF();
		tv2.switchChannel();
		//tv2.newFunction();//����
		
		TVProduct2 tv2_1 = new TVProduct2();
		tv2_1.newFunction();
		
		((TVProduct2)tv2).newFunction();//���� ����ȯ
	
		//���������� : ��������
		TV tv = null;
		if(5>3) {
			tv = new TVProduct1();
		}
		else {
			tv = new TVProduct2();
		}
		
	}
}
