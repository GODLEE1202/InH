package COM.ex0427.pm;

import java.io.File;
import java.io.FileInputStream;

public class Ex06 {
	public static void main(String[] args) {
		File file = new File("C:/Users/IH/eclipse-workspace/file/aaa.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			int temp = 0;
			while((temp = fis.read() )!= -1) {
				System.out.print((char)temp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
