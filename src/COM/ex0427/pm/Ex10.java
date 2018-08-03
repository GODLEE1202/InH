package COM.ex0427.pm;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex10 {
	
	/*
	 * ���� ��Ʈ��
	 * ������Ʈ���� �ܵ������� ������ �Ұ����ϰ� ���ν�Ʈ���� ���ڰ����� ��� ����Ҽ� �ִ�.
	 * ��ǥ���� ������Ʈ�����δ� BufferedInputStream�� BufferedOutputStream�� �ִ�.
	 * BufferedStream�� input Ȥ�� output ����� �ش� �����͸� ���۴����� �߰� �߶� ������ ��Ű�� ������ �Ѵ�.
	 * �����Ͱ� Ŀ���� Ŀ������ Buffered������Ʈ���� ���ҷ� ���� ȿ���� �ش�ȭ �ǹǷ� Java6���������� ���� ���ʼ��� �����
	 */
	
	
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:/Users/IH/eclipse-workspace/file/ddd.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			int temp = 0;
			while((temp=bis.read())!=-1) {
				System.out.println((char)temp);
			}
			bis.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
