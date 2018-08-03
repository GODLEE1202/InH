package COM.ex0427.pm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Ex11 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:/Users/IH/eclipse-workspace/file/aaa.txt");
			
			char[] c = new char [10];
			fr.read(c);
			
			System.out.println(Arrays.toString(c));
			
			fr.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
