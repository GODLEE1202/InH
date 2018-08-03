package COM.ex0430.am;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class Ex01 {
	/*
	 * FileSystem
	 * ����: FileSystem �ν��Ͻ��� = FileSystems.getDefault();
	 * ���� �ý����� �ش� ���������ġ�� �뷮�̳� �������ͽ����� Ȯ���ϰ��� �ϴ� �뵵�� ����Ѵ�.
	 * ���� �ý��ۿ����� ���� �߿��� �������ͽ� ������ ���� ����κп��� ���Ǵ� ��찡 ����ϸ� path�ʹ� ��ȣ ���� ���迡 �ִ�.
	 * ����̺��� �������ͽ� �� �ƴ϶� �ش� ���� �ý��� �ȿ� �����ϴ� ������ �������ͽ����� ������ �����ϴ�.
	 * 
	 */
	public static void main(String[] args) throws IOException {
		FileSystem fs = FileSystems.getDefault();
		for (FileStore store : fs.getFileStores()) {
			System.out.println("����̺� �� : " + store.name());
			System.out.println("���Ͻý��� : "+  store.type());
			System.out.println("��ü ���� : "+ store.getTotalSpace() + "����Ʈ");
			System.out.println("������� ���� : \t " + (store.getTotalSpace() - store.getUsableSpace())+ "����Ʈ");
		
			System.out.println("��� ������ ���� : \t "+store.getUsableSpace() + " ����Ʈ");
			
		
		
		}
		
	}
}
