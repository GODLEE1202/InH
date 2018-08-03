package COM.ex0430.am;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex03 {
	/*
	 * Files
	 * 동기화 및 안정성에 대한 문제가 기존 IO에서 자주 거론되었고 이를 수정하기 위해 실제 모든 외부 파일을 Static형태로 접근하여 지원하기 시작
	 * 직접적인 데이터의 액세스를 IS의 물리적이고 직접적인 방법을 통해 다이렉트로 제공하는 클래스 중 하나
	 * 모든 자원이 Static으로 접근이 가능하며 해당 접근을 통해 기존의 IO보다 안정성과 속도를 향상시키게 됨
	 * Files는 기존의 IO의 File보다 더 빠른 제어와 동기화를 지원
	 * 단, Files 객체 하나만으로는 사용할 수 없으며 기존의 Path 와 FileSystem하고의 상호 보완을 통해 완전하게 사용이 가능하다.
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
			System.out.println("디렉토리 : "+ path.getFileName());
			System.out.println("파일 " + path.getFileName()+ "크기" + Files.size(path));
		}
		else {
			System.out.println("디렉토리 : "+ path.getFileName());
			System.out.println("파일 " + path.getFileName()+ "크기" + Files.size(path));
		}
	}
	
	
	
}
}
