package COM.ex0420.pm;

import COM.ex0420.am.Box;

public class Ex01 {
//	int i = 1;
//	double d = 2.0;
//	
//	
	//Integer i = new Integer(2);
	public static void main(String[] args) {
		/*
		 * Wrapper Class
		 * �⺻�� Ÿ���� ��ġ ������ó�� ����ϱ� ���� ������� Ŭ����
		 * �Ϲ������δ� �⺻�� Ÿ���� �� �ձ��ڸ� �빮�ڷ� ����� ���� �� �⺻�� Ÿ���� Wrapper class�� �Ǹ� int�� Integer
		 * char�� Character�� ������ �־�� �Ѵ�.
		 * ���� ��ü �߿� �ּҰ� �ƴ� ���� ���� ������ �Ͼ�� ��ü �̱⵵ �ϴ�.
		 * 
		 */
		
		Byte a = 1;
		
		Short s = 2;
		
		Integer i = 2; //int
		
		Long l = 3L;
		
		Float f = 3.2F;

		Double d = 5.5;
		
		Character c = '��';
		
		Boolean b = false;

		int e = Integer.parseInt("12345");
		System.out.println(e+1);
		
		Integer g = 3;
		Integer h = g;
		g += 2;
		System.out.println(h);
	
		Box<Integer, String> box = new Box<Integer, String>();
		System.out.println(box);
		System.out.println(h);
	}
}
