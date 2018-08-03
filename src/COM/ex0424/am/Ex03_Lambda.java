package COM.ex0424.am;

public class Ex03_Lambda {
	
	public static void main(String[] args) {
		
		/*
		 * 람다식
		 * 자바 1.8부터 지원하기 시작한 기능
		 * 수학자 알론소 처치가 발표한 람다 계산법에서 사용된 식으로 존 메카시 가 프로그래밍 언어에 도입한것이 시초
		 * 람다식 사용시 코드가 매우 간결해지고 여러 컬렉션의 요소를 필터링 하거나 매핑해서 원하는 결과를 쉽게 집계할 수 있다.
		 * 람다식의 조건
		 * => 람다식을 쓰기 위한 함수적 인터페이스는 반드시 1개의 추상메서드만을 가져야만 한다.
		 */
		
		
		/*
		 * //어나니머스 클래스 방식
		  Interface1 inter1 = new Interface1() {
			@Override
			public void method1() {	
				System.out.println("이것은 익명으로 만들어진 클래스의 메서드 입니다");
			}
		};
		inter1.method1();
		
		*/
		 
		 
		
		
		
		//람다식 방식 코드 줄수 줄어듬
		Interface1 inter2 = () -> {
			System.out.println("이것은 익명으로 만들어진 클래스의 메서드입니다.2222222");
			int a=1;
			int b = 2;
			System.out.println(a+b);
			
		};
		inter2.method1();
		
	
	}
	
}
