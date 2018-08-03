package COM.ex0424.am;

public class Ex02 {
	//인터페이스와 추상클래스의 예외사항
	/*
	 * 인터페이스와 추상클래스는 자체적으로 인스턴스 생성이 불가능하다.
	 * 단, 인터페이스나 추상클래스에서 선언한 추상메서드를 인스턴스 선언시 막바로 구현할 경우 인터페이스나 추상클래스 만으로도 인스턴스 선언이 가능하다.
	 * 이때 구현되는 클래스를 익명 클래스(anonymous class)라고 부르기도 한다.
	 * 
	 */
	public static void main(String[] args) {
		Interface1 inter = new Interface1() {	
			@Override
			public void method1() {
			
				
			}
		};
		
	}
}
