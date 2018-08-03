package COM.ex0430.pm;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("[7����Ʈ ũ��� ���� ���� ]");
		ByteBuffer buffer= ByteBuffer.allocate(7);
		printState(buffer);
	
	
		buffer.put((byte)10);
		buffer.put((byte)11);
		System.out.println("2����Ʈ ���� �� ");
		printState(buffer);
		
		buffer.put((byte)12);
		buffer.put((byte)13);
		buffer.put((byte)14);
		System.out.println("3����Ʈ ���� �� ");
		printState(buffer);
		
		buffer.flip();
		System.out.println("flip ������");
		printState(buffer);
		
		
		byte[] b1 = new byte[3];
		buffer.get(b1);
		//buffer.get(new byte[3]);
		System.out.println("3����Ʈ ���� ��");
		printState(buffer);
		System.out.println(Arrays.toString(b1));
		
		buffer.mark();//3��ġ�� ��ŷ
		System.out.println("---���� ��ũ �س���");
		
		buffer.get(new byte[2]);
		System.out.println("2����Ʈ ���� ��");
		printState(buffer);
	
		buffer.reset();//�������� ��ŷ ��ġ�� �̵���Ŵ
		System.out.println("position�� ��ŷ ��ġ�� �̵���Ŵ");
		printState(buffer);
		
		buffer.rewind();
		System.out.println("rewind()���� �� ");
		printState(buffer);
		
		buffer.clear();
		System.out.println("clear() ���� �� ");
		printState(buffer);
	}
	
	public static void printState(Buffer buffer) {
		System.out.print("\t potion : " +buffer.position());
		System.out.print("\t limit : "+buffer.limit());
		System.out.println("\t capacity : " + buffer.capacity());
	
	
	}
	
	
}
