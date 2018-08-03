package COM.ex0423.pm;

public class Ex06_Generic {
	public static void main(String[] args) {
		
		/*
		 * 제네릭 메소드
		 * 형태 : public <타입파라미터(제네릭타입)...> 리턴 타입 메소드명(매개변수...)
		 * 메소드에서도 파라미터 타입을 이용해서 제네릭타입을 설정할 수 있다.
		 * 제네릭 메소드는 지정할 타입이 가변적일 경우 사용이 가능하다.
		 * 접근제한자 뒤에 타입 파라미터를 지정함으로써 선언이 가능하다.
		 * 호출은 두가지 방식으로 호출이 가능하다.
		 * => 메서드명(매개값)
		 * <타입파라미터> 메서드명 (매개값)
		 */
		
		
		
		
		
		
		Util util = new Util();
		Box<Integer> box1 = util.boxing(100);
		//Box<Integer> box1 = util.<Integer> <-생략가능 boxing(100);
		Box<Double> box2 = util.boxing(12.2341564);
		
		System.out.println(box1.get());
		System.out.println(box2.get());
	}
}
