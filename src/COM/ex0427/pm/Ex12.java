package COM.ex0427.pm;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class Ex12 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\IH\\eclipse-workspace\\file\\bbb.txt");
					fw.write("�����ٶ󸶹ٻ�");
					fw.close();
		
		
		
		
		
		
		} catch (Exception e) {
		}
	}
}
