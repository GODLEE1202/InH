package COM.ex0427.pm;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex09 {
	public static void main(String[] args) {
		try {
			byte[] b = {97,98,99,100,101};
			
			FileOutputStream fos = new FileOutputStream("C:/Users/IH/eclipse-workspace/file/ddd.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			bos.write(b);
			bos.close();
			fos.close();
		} catch (Exception e) {

		}
	}
}
