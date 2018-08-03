package COM.ex0417.pm;

public class ex07 {
	//메소드 오버로딩
	/*
	 * 메서드의 인자타입이 다르거나 혹은 이자의 갯수가 다르다면 메서드명을 같은 이름으로 여러개 선언할 수 있는 방식
	 * 안의 기능은 동일한데 받고자 하는 인자가 여러개일 경우 주로 사용된다.
	 * 
	 */
	int a =1;
	
	public void move(int i) {
	
	}
	//public void move(int x) {}//에러
	public void move(int g, int h) {}
	
	public void move(String s) {
	
	}
	
	public void move(double e) {
	
	}
	public static void main(String[] args) {
		sampleclass[] sc = new sampleclass[5];
		
	}

}
