package COM.ex0426.pm;

public class Ex01 {
	
	/*
	 * 쓰레드의 동기화 - synchronized
	 * 한번의 하나의 쓰레드만 객체의 자원에 접근할 수 있도록 일종의 락(rock)을 걸어서 
	 * 데이터의 일관성 및 무결성을 유지할 수 있게 만드는 명령어
	 * 
	 * synchronized는 메서드에 걸수도 있으나 일정 코드 영역을 {}로 묶어서 강제로 synchronized시킬수 있다.
	 * 
	 * 웹, 앱, 혹은 네트워크를 통해서 다수의 사용자들을 통해 서비스하는 프로그램의 경우 이 synchronized 가 거의 필수적으로 쓰인다.
	 *  
	 * 
	 */
	
	public static void main(String[] args) {
		Calc calc = new Calc();
		
		User user1 = new User(calc, "user1");
		
		User user2 = new User(calc, "user2");
		
		user1.start();
		
		user2.start();
		
	}
} 
