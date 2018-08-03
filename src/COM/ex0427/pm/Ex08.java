package COM.ex0427.pm;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex08 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:/Users/IH/eclipse-workspace/file/aaa.txt");
			FileOutputStream fos = new FileOutputStream("C:/Users/IH/eclipse-workspace/file/ccc.txt");
			
			byte[] b = new byte[1024];
			fis.read(b);
			fos.write(b);
			fis.close();
			fos.close();
			
			
		} catch (Exception e) {
			
		}
	}
}
