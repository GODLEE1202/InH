package COM.ex0430.pm;

import java.nio.ByteBuffer;

public class Ex03 {
	// Buffer의 위치 속성
	/* - Buffer위치속성은 Buffer가 생성될 시 사용자들이 접근할 수 있는
	 *   일종의 메모리 포인터라는 개념을 이용해 데이터에 접근하도록 한다.
	 * - Buffer에서 사용하는 포인터의 종류는 position, limit, capacity,
	 *   mark 라는 포인터가 존재한다.
	 * - position : 현재 읽거나 쓰는 위치값. 처음 buffer 생성시 시작값
	 *              은 0이다. limit보다는 큰 값을 가질 수 없다.
	 * - limit : 버퍼에서 데이터를 읽을 시 위치의 최종 한계를 나타냄
	 *           이 값은 capacity보다 클 수가 없다.
	 * - capacity : 버퍼의 최대 공간
	 * - mark : mark() 라는 메서드를 사용 시 실제 임시로 표시되는 위치값
	 *         을 나타냄. reset()을 통해서 돌아올 수 있는 위치를 mark를
	 *         통해 표시하는데 mark가 표시되는 지점은 position이 있던
	 *         위치를 기준으로 한다.
	 * */
	public static void main(String[] args) {
		System.out.println("[7바이트 크기로 버퍼 생성]");
		ByteBuffer buffer = ByteBuffer.allocateDirect(7);
		buffer.put((byte)10);
		buffer.put((byte)11);
		buffer.put((byte)12);
		buffer.put((byte)13);
		buffer.put((byte)14);
		buffer.flip();
		printState(buffer);
		
		buffer.get(new byte[3]);
		System.out.println("[3바이트 읽음]");
		printState(buffer);
		
		buffer.compact();
		System.out.println("[compact() 사용]");
		printState(buffer);
	}
	
	public static void printState(ByteBuffer buffer) {
		System.out.print(buffer.get(0)+", ");
		System.out.print(buffer.get(1)+", ");
		System.out.print(buffer.get(2)+", ");
		System.out.print(buffer.get(3)+", ");
		System.out.println(buffer.get(4));
		System.out.print("position : "+buffer.position()+", ");
		System.out.print("limit : "+buffer.limit()+", ");
		System.out.println("capcacity : "+buffer.capacity());
		
	}
}
