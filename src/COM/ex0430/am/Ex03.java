package COM.ex0430.am;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex03 {
	/*
	 * Files
	 * ����ȭ �� �������� ���� ������ ���� IO���� ���� �ŷеǾ��� �̸� �����ϱ� ���� ���� ��� �ܺ� ������ Static���·� �����Ͽ� �����ϱ� ����
	 * �������� �������� �׼����� IS�� �������̰� �������� ����� ���� ���̷�Ʈ�� �����ϴ� Ŭ���� �� �ϳ�
	 * ��� �ڿ��� Static���� ������ �����ϸ� �ش� ������ ���� ������ IO���� �������� �ӵ��� ����Ű�� ��
	 * Files�� ������ IO�� File���� �� ���� ����� ����ȭ�� ����
	 * ��, Files ��ü �ϳ������δ� ����� �� ������ ������ Path �� FileSystem�ϰ��� ��ȣ ������ ���� �����ϰ� ����� �����ϴ�.
	 */
	
	
public static void main(String[] args) throws IOException {
	Path path1 = Paths.get("C:\\Users\\IH\\eclipse-workspace\\file1");
	Path path2 = Paths.get("C:\\Users\\IH\\eclipse-workspace\\file1\\file.txt");

	if(Files.notExists(path1))Files.createDirectories(path1);
	if(Files.notExists(path2))Files.createFile(path2);
	
	
	Path path3 = Paths.get("C:\\Users\\IH\\eclipse-workspace\\file");
	DirectoryStream<Path> ds = Files.newDirectoryStream(path3);
	for (Path path : ds) {
		if(Files.isDirectory(path)) {
			System.out.println("���丮 : "+ path.getFileName());
			System.out.println("���� " + path.getFileName()+ "ũ��" + Files.size(path));
		}
		else {
			System.out.println("���丮 : "+ path.getFileName());
			System.out.println("���� " + path.getFileName()+ "ũ��" + Files.size(path));
		}
	}
	
	
	
}
}
