package COM.ex0419.pm;

public class SM3 {
	
	public SM3(int i){
		System.out.println("나는 sm3입니다.");
	}
	
	int fuel = 100;
	String color = "블랙";
	
	public void accelator() {
		System.out.println("차가 간다");
		fuel--;
	}
	public void putBreak() {
		System.out.println("차가 선다");
		fuel--;
	}
}
