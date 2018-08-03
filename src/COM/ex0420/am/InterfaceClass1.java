package COM.ex0420.am;

public interface InterfaceClass1 {
	//interface 예외
	/*
	 * static method는 인터페이스 내에서 선언이 가능하다.
	 * default method 또한 인터페이스 내에서 선언이 가능하다.
	 * ##두개의 메서드는 일반 메서드처럼 선언이 가능하지만 제한적으로 사용되는 기능들에 한하여 사용하는걸 권장한다.(class메모리영역)
	 * 
	 */
	public static void method1() {
		System.out.println("안녕하세요 스테틱 메소드입니다");
	}
	default void method2() {
		System.out.println("안녕하세요 디폴트 메소드 입니다.");
	}
}