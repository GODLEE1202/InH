package COM.ex0427.pm;

import java.io.IOException;
import java.io.InputStream;

public class Ex04 {
	//ǥ�������
	/*
	 * �ܼ� ȭ���� ���� �������� ������� ǥ�� ������̶�� �Ѵ�.
	 * JVM�� ���۵Ǹ鼭 �ڵ������� �����Ǵ� ��Ʈ��
	 * System.in :�ַܼκ��� �����͸� �Է¹޴µ� ���
	 * System.out:�ַܼκ��� �����͸� ��¹޴µ� ���
	 * System.err:�ַܼ� �����͸� ����ϴµ� ���(���� ����)
	 * 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("-=-�޴�=-=");
		System.out.println("1. ���� ��ȸ");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� �Ա�");
		System.out.println("4. ���� �۱�");
		System.out.println("5. ����");
		
		System.out.println("�޴��� �����ϼ���");
		
		InputStream in = System.in;
		//System.out.println(in.read());
		
		char c = (char)in.read();
		
		int i = Integer.parseInt(c+"");
		System.out.println(i+3);
		
		switch (c) {
		case '1':
			System.out.println("1. ���� ��ȸ");
			break;
		case '2':
			System.out.println("2. ���� ���");			
			break;
		case '3':
			System.out.println("3. ���� �Ա�");	
			break;
		case '4':
			System.out.println("4. ���� �۱�");	
			break;		
		case '5':
			System.out.println("5. ����");	
			break;
		
		default:
			System.out.println("����");
			break;
		}
		
	
	}
}
