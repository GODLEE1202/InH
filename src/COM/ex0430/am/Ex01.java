package COM.ex0430.am;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class Ex01 {
	/*
	 * FileSystem
	 * 형식: FileSystem 인스턴스명 = FileSystems.getDefault();
	 * 파일 시스템은 해당 보조기억장치의 용량이나 스테이터스등을 확인하고자 하는 용도로 사용한다.
	 * 서버 시스템에서는 가장 중요한 스테이터스 정보를 통한 제어부분에서 사용되는 경우가 빈번하며 path와는 상호 보완 관계에 있다.
	 * 드라이브의 스테이터스 뿐 아니라 해당 파일 시스템 안에 존재하는 파일의 스테이터스에도 접근이 가능하다.
	 * 
	 */
	public static void main(String[] args) throws IOException {
		FileSystem fs = FileSystems.getDefault();
		for (FileStore store : fs.getFileStores()) {
			System.out.println("드라이브 명 : " + store.name());
			System.out.println("파일시스템 : "+  store.type());
			System.out.println("전체 공간 : "+ store.getTotalSpace() + "바이트");
			System.out.println("사용중인 공간 : \t " + (store.getTotalSpace() - store.getUsableSpace())+ "바이트");
		
			System.out.println("사용 가능한 공간 : \t "+store.getUsableSpace() + " 바이트");
			
		
		
		}
		
	}
}
