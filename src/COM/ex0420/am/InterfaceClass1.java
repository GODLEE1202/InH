package COM.ex0420.am;

public interface InterfaceClass1 {
	//interface ����
	/*
	 * static method�� �������̽� ������ ������ �����ϴ�.
	 * default method ���� �������̽� ������ ������ �����ϴ�.
	 * ##�ΰ��� �޼���� �Ϲ� �޼���ó�� ������ ���������� ���������� ���Ǵ� ��ɵ鿡 ���Ͽ� ����ϴ°� �����Ѵ�.(class�޸𸮿���)
	 * 
	 */
	public static void method1() {
		System.out.println("�ȳ��ϼ��� ����ƽ �޼ҵ��Դϴ�");
	}
	default void method2() {
		System.out.println("�ȳ��ϼ��� ����Ʈ �޼ҵ� �Դϴ�.");
	}
}