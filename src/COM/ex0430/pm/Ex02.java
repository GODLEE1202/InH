package COM.ex0430.pm;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("[7바이트 크기로 버퍼 생성 ]");
		ByteBuffer buffer= ByteBuffer.allocate(7);
		printState(buffer);
	
	
		buffer.put((byte)10);
		buffer.put((byte)11);
		System.out.println("2바이트 저장 후 ");
		printState(buffer);
		
		buffer.put((byte)12);
		buffer.put((byte)13);
		buffer.put((byte)14);
		System.out.println("3바이트 저장 후 ");
		printState(buffer);
		
		buffer.flip();
		System.out.println("flip 실행후");
		printState(buffer);
		
		
		byte[] b1 = new byte[3];
		buffer.get(b1);
		//buffer.get(new byte[3]);
		System.out.println("3바이트 읽은 후");
		printState(buffer);
		System.out.println(Arrays.toString(b1));
		
		buffer.mark();//3위치에 마킹
		System.out.println("---현재 마크 해놓음");
		
		buffer.get(new byte[2]);
		System.out.println("2바이트 읽은 후");
		printState(buffer);
	
		buffer.reset();//포지션을 마킹 위치로 이동시킴
		System.out.println("position을 마킹 위치로 이동시킴");
		printState(buffer);
		
		buffer.rewind();
		System.out.println("rewind()실행 후 ");
		printState(buffer);
		
		buffer.clear();
		System.out.println("clear() 실행 후 ");
		printState(buffer);
	}
	
	public static void printState(Buffer buffer) {
		System.out.print("\t potion : " +buffer.position());
		System.out.print("\t limit : "+buffer.limit());
		System.out.println("\t capacity : " + buffer.capacity());
	
	
	}
	
	
}
