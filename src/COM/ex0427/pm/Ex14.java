package COM.ex0427.pm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex14 {
	//InputStreamReader, OutputStreamWriter 
	/*
	 * 1바이트 형식의 Stream을 문자단위 형태로 바꿔준다.
	 * 
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\IH\\eclipse-workspace\\file\\aaa.txt")));
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\IH\\eclipse-workspace\\file\\gggg.txt")));
			
			String line = "";
			while((line = br.readLine())!=null) {
				System.out.println(line);
				bw.write(line);
			}
			br.close();
			bw.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
