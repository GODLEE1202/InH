package COM.ex0420.am;

public class Ex05 {
	/*
	 * ���׸�
	 * �ް��� �ϴ� ��ü�� Ÿ���� �����ϱ� ���� ����ϴ� �ӽ� Ÿ��
	 * ���׸��� ���� ��ü Ÿ���� ���������ν� Object��� ������ Ÿ�� ����� ������ ��ü Ÿ�Կ� ���� ȥ���� ������ �ִ�.
	 * ���� Ŭ�������� ���� Ŭ���� �̸� �ڿ� <>�� �ٿ� �ȿ� ���ϴ� Ÿ���� �빮�� �����ڷ� ǥ���ϴµ� ��� ǥ���ϵ� ��� ����� ����
	 * Ŭ������ <>�ȿ� ������ Ÿ���� �״�� ��������� Ÿ���̳� �޼����� ���� Ȥ�� �Ű����� Ÿ������ ����� �� �ִ�.
	 * ��ü ����� <> �ȿ� Ÿ���� �����ϰ� �Ǹ� �ش� �ν��Ͻ��� <>�ȿ� ������ Ÿ���� �״�� ���󰣴�.
	 */
	public static void main(String[] args) {
		//Box<int,float> box2 = new Box<int, float>();
		Box<String, String> box = new Box<String, String>();
		box.set("asd");
		box.setM("efgh");
		
		//String i = box.get();
		
		System.out.println(box.getT());
		System.out.println(box.getM());
	}
}
