package COM.ex0420.am;

public class TVProduct2 implements TV{

	@Override
	public void turnONOFF() {
		System.out.println("������ �����Է�");
		
	}

	@Override
	public void switchChannel() {
		System.out.println("������ ä�� �Է�");
	}
	public void newFunction() {
		System.out.println("���ο� ���");
	}

}
