package COM.ex0430.pm;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class Ex01 {
	/*
	 * ����
	 * �����͸� �а� ���� ���� �޸� �迭
	 * ���� �����͸� �̵���ų�� ���� ������ �̵���Ų��.
	 * ���۴� ������ Ÿ�Կ� ���� ������ ���� ���۸� �������� ������ byteBuffer�� �ַ��� �ǰ� Ư�� �����Ϳ� ���� IntBuffer, CharBuffer,DoubleBuffer ������ ����Ҽ� �ִ�.
	 * ���۸� �����ϴ� ����� �ΰ����� �ִ�.
	 * 
	 * �� ���̷�Ʈ ���� : JVM�� �� �޸� ������ ������ �̿��ϴ� ���ۿ� ���� ������ ������.
	 * ������ ũ�Ⱑ �۴�
	 * ����� ������ ����.
	 * ���� �������� ����¿� ���Ǵ� ��찡 ����.
	 * 
	 * ���̷�Ʈ ���� : �ü���� �޸� ������ ���� �����ϴ� ����
	 *  ���� ������ ������.
	 *  ������ ũ�Ⱑ ũ��.
	 *  ������ ����� ������ ����.
	 *  ū�������� ����¿� ���Ǵ� ��찡 ����.
	 *  
	 *  
	 */
	public static void main(String[] args) {
		
		//�� ���̷�Ʈ ���� ���� ���
		byte[] buteArr = new byte[100];
		ByteBuffer bb = ByteBuffer.wrap(buteArr);
		
		//���̷�Ʈ ���ۼ��� ���
		ByteBuffer bytebuffer = ByteBuffer.allocate(100);
		System.out.println("����뷮 : "+ bytebuffer.capacity()+ " ����Ʈ");
	
		CharBuffer cb = ByteBuffer.allocate(100).asCharBuffer();
		System.out.println("���� �뷮 : "+cb.capacity()+ "����");
		
		IntBuffer ib = ByteBuffer.allocate(100).asIntBuffer();
		System.out.println("���� �뷮 : "+ ib.capacity()+"����");
	
	
	
	
	}
}
