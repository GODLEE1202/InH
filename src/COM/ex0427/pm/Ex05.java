package COM.ex0427.pm;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		/*
		 * ��Ʈ�� ����
		 * 
		 * ����Ʈ ��� ��Ʈ��
		 * ����Ʈ ��� ��Ʈ���� 1����Ʈ�� �������� ����̽����� ����̽� Ȥ�� ��ġ���� ��ġ�� ������ �� ����Ʈ ������� �����ϴ� ��Ʈ���� ��Ī�Ѵ�.
		 * 
		 * ����Ʈ ��� ��Ʈ�� �̸� : InputStream , OutputStream
		 * ��) ArrayInputStream, ArrayOutputStream

		 * 
		 * 
		 * ���� ��� ��Ʈ��
		 * ���ڱ�� ��Ʈ���� 2����Ʈ�� �������� ��� Ȥ�� ����̽�to����̽� ���۽� ���� ������� �����ϴ� ��Ʈ���� ��Ī�Ѵ�.  
		 * 
		 * ���� ��� ��Ʈ�� �̸� : Reader , Writer
		 * ��) BufferedReader, BufferedWriter
		 * 
		 * ���α׷� -> Ÿ��
		 * OutputStream, writer
		 * ���α׷� <- Ÿ��
		 * InputStream, Reader
		 */
		
		byte[] intsrc = {1,2,3,4,5,6,7,8,9,0};
		byte[] outsrt = null;
		
		ByteArrayInputStream bis = new ByteArrayInputStream(intsrc);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		int tmp=0;
		while((tmp = bis.read())!=-1) {
			bos.write(tmp);
		}
	
		outsrt = bos.toByteArray();
		System.out.println(Arrays.toString(intsrc));
		System.out.println(Arrays.toString(outsrt));
	}
}
