package COM.ex0418.am;

public class ex02 {
	/*
	 * ������ �����
	 * �ʵ��� �ʱ�ȭ Ȥ�� ��ü�� �ʱ�ȭ�� ���Ǵ� �޼���
	 * ������ �ȿ����� �ٸ� �����ڸ� ȣ�� �� �� �ְ� ���� �Ϲ� �޼��� ȣ���� �����ϴ�.
	 * �Ϲ� �޼���� �������� ȣ���� �Ұ����ϴ�.
	 * �����ڴ� �����ڸ� ȣ���� �� ������ �������� ȣ���� ��ȯ�ݺ� �Ǵ� ��� ������ ���Ƿ� ����.
	 * 
	 */
	public ex02() {
		this(1);
		System.out.println("�ȳ��ϼ���");
		method1();
		
	}
	public ex02(int a) {
		this(1,2);
		
		System.out.println("zzzzzz");
		//this(1,2);//����
	
	}
	public ex02(int a, int b) {
		//this();//������ ���� �ȵȴ�.
		System.out.println("asdasdasdasd");
	}
	public ex02(int a,int b, int c) {
		this(2);
	}
	
	
	public void method1() {
		//this();//����
		
	}
}
