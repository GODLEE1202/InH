package COM.ex0419.pm;

public class Ex02_static {
	/*
	 * static
	 * Ŭ���� ������ ����Ǵ� �޼��� Ȥ�� �ɹ������� ������ �� ����
	 * static�ʵ�/�޼���� ��� �ν��Ͻ����� �����Ѵ�.
	 * static�ʵ�/�޼���� �ν��Ͻ� ���� ���� ������ �����ϴ�.
	 * static �ʵ� / �޼���� ���°� ���α׷� ������ ������ ������ �ȴ�.
	 * static ������ �Ű������� �޼���, �ʵ�� ��� JVM �޸� �� �����ϰ� �ȴ�.
	 * �̷��� static�� �޸�� ��� ������ ��� �޸��� ������ ����� Ŀ�� �ý����� ���ϸ� ���� ��Ƹ԰� �ȴ�.
	 * ���� �ý��ۿ� ġ������ �ջ��� ���� �� �����Ƿ� static�� ������ Ȥ�� ����޼��忡���� ����Ѵ�.
	 * 
	 */
	
	
	int a = 1;
	static int b = 2;
	
	public static void main(String[] args) {
		Ex02_static ex02_static = new Ex02_static();
		ex02_static.a = 1;
		ex02_static.b = 3;
		
		System.out.println(b);
		System.out.println(ex02_static.b);
		ex02_static.b++;
		Ex02_static ex02_1 = new Ex02_static();
		System.out.println(ex02_1.b);
		
		method1();
		ex02_static.method1();
	}
	public static void method1() {
		System.out.println("����ƽ �޼��� �Դϴ�");
	}
}
