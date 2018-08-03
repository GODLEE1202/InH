package COM.ex0427.pm;

import java.io.File;
import java.io.FileOutputStream;

public class Ex07 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\IH\\eclipse-workspace\\file/bbb.txt");
		byte[] b = {99,98,97,100,101};
		try {
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(b);
			
			
			fos.close();
		}catch(Exception e) {
			
		}
	}
}
