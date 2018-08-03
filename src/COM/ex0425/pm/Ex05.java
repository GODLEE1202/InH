package COM.ex0425.pm;

import java.util.InputMismatchException;

public class Ex05 {
	/*
	 * throws 
	 * 하위 메서드에서 일어나는 예외상황을 하위 메서드들이 처리하게 되면 모든로직을 try~catch로 감싸야한다.
	 * 하위 메서드는 온전히 순수한 로직에만 집중하고 에러 처리를 상위메서드에서 처리하기 위해 에러를 상위메서드로 던지도록 throws라는 명령을 사용한다.
	 * 사용법: 메서드 선언부 throws 예외들{}
	 * 주의할 점 : 하위 메서드에서 throws에 명시된 에러들은 되도록 상위 메서드에서 세분화하여 처리하도록 유도한다.
	 */
	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		ex05.method1();
	}
	public void method1() {
		try {
			method2();
		} catch (InputMismatchException e) {
			System.out.println("이것은 메소드2에서 일으킨 에러");
		} catch (ArithmeticException e) {
			System.out.println("이것은 메소드2에서 일으킨 에러2");
		} catch (Exception e) {
			System.out.println("이것은 메소드2에서 일으킨 에러3");
		}
		
	}
	public void method2() throws ArithmeticException, InputMismatchException, Exception{
		
		System.out.println(0/0);
	}
}
