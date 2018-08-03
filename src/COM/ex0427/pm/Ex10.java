package COM.ex0427.pm;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex10 {
	
	/*
	 * 보조 스트림
	 * 보조스트림은 단독적으로 동작이 불가능하고 메인스트림을 인자값으로 담아 사용할수 있다.
	 * 대표적인 보조스트림으로는 BufferedInputStream과 BufferedOutputStream이 있다.
	 * BufferedStream은 input 혹은 output 수행시 해당 데이터를 버퍼단위로 잘게 잘라 전송을 시키는 역할을 한다.
	 * 데이터가 커지면 커질수록 Buffered보조스트림의 역할로 인해 효율이 극대화 되므로 Java6버전에서는 거의 준필수로 사용함
	 */
	
	
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:/Users/IH/eclipse-workspace/file/ddd.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			int temp = 0;
			while((temp=bis.read())!=-1) {
				System.out.println((char)temp);
			}
			bis.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
