package COM.ex0427.pm;

import java.io.File;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		
		/*
		 * File
		 * �������� file ó���� ���� ��� ����� �����ϴ� Ŭ����
		 * �������� ������ ���� ��������� �����Ѵ�.
		 */
		
		File f = new File("C:\\Users\\IH\\eclipse-workspace\\file\\aaa.txt");
		
	//System.out.println(f.exists());
	
	if(f.exists()) {
//		try {
//			f.createNewFile();	
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//
//		}
		//�������� �ƴ��� ���� ����
		System.out.println(f.isFile());
		
		//������
		System.out.println(f.getAbsolutePath());
	
		//�����	throws IOException
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getPath());
		
		//�����̸�
		System.out.println(f.getName());
		
		//����path
		System.out.println(f.getParent());
	}
}
}
