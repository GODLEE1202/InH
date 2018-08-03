package COM.ex0424.pm;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Ex05 {
	/*
	 * 람다식 종류
	 * 람다식의 종류로는 총 다섯가지 Java API에서 제공한다.
	 * consumer : 매개값은 있고 리턴값은 없다.
	 * supplier : 매개값은 없고 리턴값은 있다.
	 * function : 매개값도 있고 리턴값도 있다 //주로 매개값을 리턴값으로 매핑할때 사용
	 * Operator : 매개값도 있고 리턴값도 있다. // 주로 매개값을 연산하고 결과를 리턴
	 * Predicate: 매개값은 있고 리턴값은 무조건 Boolean //매개값을 조사해 true/false를 리턴하고자 할 경우 사용
	 * 
	 * 
	 * 매서드 참조
	 * 메서드 참조는 람다식에서 메소드를 참조해서 매개변수의 정보및 리턴타입을 알아내어 불필요한 매개변수와 타입을 제거하는 것이 목적
	 * 메서드 참조는 일반 메서드 참조, 매개변수의 메서드 참조, 생성자 참조가 존재한다.
	 * 형식: 클래스::메서드
	 */
	
	
	public static void main(String[] args) {
		/*
		 * Function<String, Member> function1 = (s) -> new Member(s);
			Member member1 = function1.apply("abvzd");
		*/
		Function<String, Member> func1 = Member::new;
		Member member1 = func1.apply("asdsd");
		
		BiFunction<String, String, Member> func2 = Member::new;
		Member member2 = func2.apply("김삿갃", "ㅁㄴㅇㅁㄴㅇ");
	}
}
