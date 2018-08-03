package COM.ex0420.am;

public class TVProduct1 implements TV{

	@Override
	public void turnONOFF() {
		System.out.println("돌려서 전원 켜기 /끄기");
	}

	@Override
	public void switchChannel() {
		System.out.println("기계식 채널 돌림");
		
	}
	

}
