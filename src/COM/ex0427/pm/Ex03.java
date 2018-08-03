package COM.ex0427.pm;

import java.io.File;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		
		/*
		 * File
		 * 물리적인 file 처리에 대한 모든 기능을 제공하는 클래스
		 * 물리적인 파일을 통한 각종기능을 제공한다.
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
		//파일인지 아닌지 묻는 문장
		System.out.println(f.isFile());
		
		//절대경로
		System.out.println(f.getAbsolutePath());
	
		//상대경로	throws IOException
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getPath());
		
		//파일이름
		System.out.println(f.getName());
		
		//상위path
		System.out.println(f.getParent());
	}
}
}
