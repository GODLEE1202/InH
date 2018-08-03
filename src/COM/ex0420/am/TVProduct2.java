package COM.ex0420.am;

public class TVProduct2 implements TV{

	@Override
	public void turnONOFF() {
		System.out.println("리모컨 전원입력");
		
	}

	@Override
	public void switchChannel() {
		System.out.println("리모콘 채널 입력");
	}
	public void newFunction() {
		System.out.println("새로운 기능");
	}

}
