package COM.ex0426.pm;

import java.util.Arrays;
import java.util.List;

public class Ex05 {
	/*
	 * 이전까지 콜렉션의 순차적인 처리를 위해 iterator 를 사용했어야만 했다.
	 * 하지만 Stream이란 java8에서 제공하는 클래스가 나오면서 람다식으로 요소처리 코드를 제공할 수 있게 되었다.
	 * 또한 내부 만복자를 사용함으로 병렬처리가 매우 쉬워진다는 장점이 있다.
	 * Stream은 사용자의 옵션에 따라 중간처리 혹은 최종처리가 가능하다.
	 * 
	 */
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("rkrkrkk", 10),
				new Student("asda", 20),
				new Student("미미미미", 30));

		double avg = list.stream().mapToInt(Student::getScore).average().getAsDouble();
		System.out.println("평균점수 : "+ avg);

		
	}
}
