package COM.ex0430.pm;

import java.nio.ByteBuffer;

public class Ex03 {
	// Buffer�� ��ġ �Ӽ�
	/* - Buffer��ġ�Ӽ��� Buffer�� ������ �� ����ڵ��� ������ �� �ִ�
	 *   ������ �޸� �����Ͷ�� ������ �̿��� �����Ϳ� �����ϵ��� �Ѵ�.
	 * - Buffer���� ����ϴ� �������� ������ position, limit, capacity,
	 *   mark ��� �����Ͱ� �����Ѵ�.
	 * - position : ���� �аų� ���� ��ġ��. ó�� buffer ������ ���۰�
	 *              �� 0�̴�. limit���ٴ� ū ���� ���� �� ����.
	 * - limit : ���ۿ��� �����͸� ���� �� ��ġ�� ���� �Ѱ踦 ��Ÿ��
	 *           �� ���� capacity���� Ŭ ���� ����.
	 * - capacity : ������ �ִ� ����
	 * - mark : mark() ��� �޼��带 ��� �� ���� �ӽ÷� ǥ�õǴ� ��ġ��
	 *         �� ��Ÿ��. reset()�� ���ؼ� ���ƿ� �� �ִ� ��ġ�� mark��
	 *         ���� ǥ���ϴµ� mark�� ǥ�õǴ� ������ position�� �ִ�
	 *         ��ġ�� �������� �Ѵ�.
	 * */
	public static void main(String[] args) {
		System.out.println("[7����Ʈ ũ��� ���� ����]");
		ByteBuffer buffer = ByteBuffer.allocateDirect(7);
		buffer.put((byte)10);
		buffer.put((byte)11);
		buffer.put((byte)12);
		buffer.put((byte)13);
		buffer.put((byte)14);
		buffer.flip();
		printState(buffer);
		
		buffer.get(new byte[3]);
		System.out.println("[3����Ʈ ����]");
		printState(buffer);
		
		buffer.compact();
		System.out.println("[compact() ���]");
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
