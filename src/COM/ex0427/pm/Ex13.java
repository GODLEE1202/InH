package COM.ex0427.pm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex13 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:/Users/IH/eclipse-workspace/file/ccc.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/IH/eclipse-workspace/file/fff.txt"));
			
			String line = "";
			while((line = br.readLine())!=null){
				System.out.println(line);
				bw.write(line);
			}
			br.close();
			bw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
