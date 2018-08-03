package COM.ex0430.pm;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class Ex01 {
	/*
	 * 버퍼
	 * 데이터를 읽고 쓰기 위한 메모리 배열
	 * 실제 데이터를 이동시킬때 버퍼 단위로 이동시킨다.
	 * 버퍼는 데이터 타입에 따라 굉장히 많은 버퍼를 가지지만 보통은 byteBuffer가 주류가 되고 특정 데이터에 따라서 IntBuffer, CharBuffer,DoubleBuffer 등으로 사용할수 있다.
	 * 버퍼를 선언하는 방식은 두가지가 있다.
	 * 
	 * 넌 다이렉트 버퍼 : JVM의 힙 메모리 영역에 공간을 이용하는 버퍼와 버퍼 생성이 빠르다.
	 * 버퍼의 크기가 작다
	 * 입출력 성능이 낮다.
	 * 작은 데이터의 입출력에 사용되는 경우가 많다.
	 * 
	 * 다이렉트 버퍼 : 운영체제의 메모리 공간에 직접 선언하는 버퍼
	 *  버퍼 생성이 느리다.
	 *  버퍼의 크기가 크다.
	 *  버퍼의 입출력 성능이 높다.
	 *  큰데이터의 입출력에 사용되는 경우가 많다.
	 *  
	 *  
	 */
	public static void main(String[] args) {
		
		//넌 다이렉트 버퍼 선언 방식
		byte[] buteArr = new byte[100];
		ByteBuffer bb = ByteBuffer.wrap(buteArr);
		
		//다이렉트 버퍼선언 방식
		ByteBuffer bytebuffer = ByteBuffer.allocate(100);
		System.out.println("저장용량 : "+ bytebuffer.capacity()+ " 바이트");
	
		CharBuffer cb = ByteBuffer.allocate(100).asCharBuffer();
		System.out.println("저장 용량 : "+cb.capacity()+ "문자");
		
		IntBuffer ib = ByteBuffer.allocate(100).asIntBuffer();
		System.out.println("저장 용량 : "+ ib.capacity()+"정수");
	
	
	
	
	}
}
