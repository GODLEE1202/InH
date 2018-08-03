package COM.ex0427.pm;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		/*
		 * 스트림 종류
		 * 
		 * 바이트 기반 스트림
		 * 바이트 기반 스트림은 1바이트를 기준으로 디바이스에서 디바이스 혹은 장치에서 장치로 전송할 때 바이트 기반으로 전송하는 스트림을 총칭한다.
		 * 
		 * 바이트 기반 스트림 이름 : InputStream , OutputStream
		 * 예) ArrayInputStream, ArrayOutputStream

		 * 
		 * 
		 * 문자 기반 스트림
		 * 문자기반 스트림은 2바이트를 기준으로 통신 혹은 디바이스to디바이스 전송시 문자 기반으로 전송하는 스트림을 총칭한다.  
		 * 
		 * 문자 기반 스트림 이름 : Reader , Writer
		 * 예) BufferedReader, BufferedWriter
		 * 
		 * 프로그램 -> 타겟
		 * OutputStream, writer
		 * 프로그램 <- 타겟
		 * InputStream, Reader
		 */
		
		byte[] intsrc = {1,2,3,4,5,6,7,8,9,0};
		byte[] outsrt = null;
		
		ByteArrayInputStream bis = new ByteArrayInputStream(intsrc);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		int tmp=0;
		while((tmp = bis.read())!=-1) {
			bos.write(tmp);
		}
	
		outsrt = bos.toByteArray();
		System.out.println(Arrays.toString(intsrc));
		System.out.println(Arrays.toString(outsrt));
	}
}
