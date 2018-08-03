package COM.ex0430.am;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("C:\\Users\\IH\\eclipse-workspace\\file\\aaa.txt");
		System.out.println("���丮 ����  :"+ Files.isDirectory(path));
		System.out.println("���Ͽ��� : "+ Files.isRegularFile(path));
		System.out.println("������ ���� �ð� : "+ Files.getLastModifiedTime(path));
		System.out.println("���� ũ�� : "+ Files.size(path));
		System.out.println("������ : "+ Files.getOwner(path).getName());
		System.out.println("�������� ���� : "+ Files.isHidden(path));
		System.out.println("�б� ���� ���� "+ Files.isReadable(path));
		System.out.println("���� ���� ���� "+ Files.isWritable(path));
		
	}
}
