package COM.ex0424.am;

public class Ex04 {

	/*
	 * 타켓 타입과 함수적 인터페이스
	 * 람다식에 쓰이는 인터페이스를 함수적 인터페이스라 명명한다.
	 * 그래서 람다식에 쓰이는 인터페이스의 선언부 위쪽에는 FunctionalInterface라는 어노테이션을 걸어 메서드나 다른 기능에 제약을 걸도록 한다.
	 * 람다식은 대입될 인터페이스의 종류에 따라 작성법이 달라지기 떄문에 람다식이 대입될 인터페이스를 람다식의 타겟 타입이라고 한다.
	 * 
	 */
	
	public static void main(String[] args) {
		Interface2 inter2 = new Interface2() {
			
			/*@Override
			public void method2() {
				
				
			}*/
			
			@Override
			public void method1() {
				
				
			}
		};//어나니머스 클래스 방식
		
		Interface2 inter3 = ()->{	//람다식을 할떄는 인터페이스에 메소드가 1개여야 한다. 2개면 오류가 남
			
		}
		
		
		
	}

}
