package COM.ex0419.pm;

public class SM3 {
	
	public SM3(int i){
		System.out.println("���� sm3�Դϴ�.");
	}
	
	int fuel = 100;
	String color = "��";
	
	public void accelator() {
		System.out.println("���� ����");
		fuel--;
	}
	public void putBreak() {
		System.out.println("���� ����");
		fuel--;
	}
}
