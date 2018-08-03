package COM.ex0417.am;

public class car {
	String 색깔 = "검정색";
	int 연료 = 80;
	
	public void 엑셀누르기() {
		System.out.println("차가 간다.");
		연료 --;
	}
	public void 브레이크누르기() {
		System.out.println("차가 선다.");
		연료 --;
	}

}
