package COM.ex0423.pm;

public class Ex04Enum {

	/*
	 * ������(Enum)
	 * ���ο� ������ Ÿ���� ����
	 * �������� Ŭ���� ����ο� class��� enum �� �־� �����Ѵ�.
	 * ����Ÿ���� Ŭ���� ������ ����Ǿ����� Ÿ���̸� �ݵ�� ������ �����Ͽ� ����ؾ� �Ѵ�.
	 * 
	 */
	
	public String name;
	public int size;
		
	public Type type;
	
	
	public static void main(String[] args) {
		Ex04Enum ex04 = new Ex04Enum();
		Ex04Enum ex04_1 = new Ex04Enum();
		
		ex04.name = "����Ű";
		ex04.size = 255;
		System.out.println("�Ź��̸�"+ ex04.name);
		System.out.println("�Ź߻�����"+ ex04.size);
		
		ex04.type = Type.HIKING;
		System.out.println("�Ź� ����"+ex04.type);
		
		ex04_1.type = Type.HIKING;
		System.out.println(ex04.type == ex04_1.type);
		
	}
}
