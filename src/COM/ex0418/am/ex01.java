package COM.ex0418.am;

public class ex01 {
	/*
	 * this
	 * ��ü ������ �ʵ� Ȥ�� �޼��带 ����Ҷ� �տ� ������� ��ɾ�
	 * ����:this.�ʵ�� , this.�޼����
	 * �ʵ峪 �޼��带 ���ο��� ȣ���Ҷ� ���� ����ó�� ȣ���� �����ϸ� this����� ���� �Ǿ� �� �� �ִ�.
	 * ��, �����ڸ� ȣ�� �� this�� ������ �Ұ��� �ϸ� ȣ�� ������ this(�Ű�����)�� �ȴ�.
	 * 
	 */
	
	int a;
	String b;
	
	public ex01() {
		
	}
	
	
	public ex01(int a, String b) {
		this();
		this.a = a;
		this.b = b;
		
	}
	
	public ex01(int a) {
		this();
	}


	public void method1() {
		this.a=1;
		this.b="asd";
		this.method2();
	}
	public void method2() {
		
	}
	public void method3(int a, String b) {
		this.a = a;
		this.b = b;
		
	}
}
