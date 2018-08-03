package COM.ex0425.pm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	
	/*
	 * 예외처리
	 * 예외 : 프로그램 코드에 의해서 수습 될 수 있는 다소 미약한 오류
	 * 프로그래머의 실수로 나타나는 코드의 에러가 아닌 외부의 상황에 따른 에러의 경우 예외로 본다.
	 * 예외는 반드시 처리되어야 하며 이런 예외를 처리할 수 있는 기능이 java에는 존재한다.
	 * java에서는 예외를 두가지 방식으로 처리가 가능한데 
	 * 1.try~catch
	 * 2.throws
	 * 로 처리 가능
	 * 
	 * try~catch는 try문장에 에러가 날 문장을 넣어주고 catch는 해당문장에서 일어날 예외를 매핑하여 해당 예외에 따른 로직을 넣어준다.
	 * 형식 try{예외가 발생할 문장}
	 * catch(매핑할 클래스 변수명){예외를 처리할 문장}
	 * catch문은 여러개를 쓸수가 있으며 항상 맨 마지막에 Exception을 위치시키는것을 권장한다.
	 * Exception은 모든 예외클래스의 부모클래스이고 exception이 catch문 상위에 있을 경우 
	 * 다른 예외 클래스를 태울수 없기에 Exception이 있는 catch문은 항상 맨 마지막에 실행하도록 한다.
	 * 
	 */
	
	
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			int i = scan.nextInt();
			System.out.println(0/0);	
		}
//		catch(Exception e3) {		Exception은 예외처리클래스의 부모클래스라서 위에 존재할경우 밑에 에러는 처리가 안됨 그래서 항상 아래쪽에 넣음
//			System.out.println("뭔진 모르겠지만 에러가 났다!!");
//		}		
		catch (ArithmeticException e1) {
			System.out.println("이상한 숫자 나누기");
		}
		catch (InputMismatchException e2) {
			System.out.println("숫자 입력하라고");
		}
		catch(Exception e3) {
			System.out.println("뭔진 모르겠지만 에러가 났다!!");
		}
		
	}
}
