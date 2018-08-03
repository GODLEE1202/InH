package COM.ex0417.pm;

public class ex06 {
	public static void main(String[] args) {
		/*
		 * 생성자 메서드
		 * 형태 : 접근제한자 클래스명(매개변수){}
		 * 생성자 메서드는 인스턴스 선언시 최초로 호울최어지는 메서드 이다.
		 * 인스턴스 값의 초기화를 위해 존재함
		 * 생성자 메서드는 선언을 하지 않을시 매개변수도 로직도 존재하지 않는 텅텅 빈 메서드를 디폴트로 만들어서 언언할 수 있고록 돕는다.
		 * 단 생성자메서드를 선언시 디폴트 메서드는 소명한다
		 * 만약 생성자 메서드에 매개변수가 존재할 경우 인스턴스 언언시 해당 매개변수를 채워주어야만 정상적인 선언이 가능하다
		 * 생성자 메서드에서는 일반 메서드의 접근은 되지만 반대로 일반 메서드에서 생성자 메서드로의 접근은 불가능하다.
		 * 생성자메서드는 보통은 인스턴스의 필드를 초기화할때 사용하는 경우가 많다
		 * 
		 */
		
		
		
		scampleClass1 sc1 = new scampleClass1(5);
	
		sampleClass2 sc2 = new sampleClass2(1,"ssss");
		System.out.println(sc2.i);
		System.out.println(sc2.s);
	}
	
}
