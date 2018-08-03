package COM.ex0410.pm;

public class Ex04 {

	public static void main(String[] args) {
		// 논리 연산자
		/* boolean변수 혹은 boolean 값을 결과로 하는 조건식을 허용하는 연산자
		 * 조건식과의 조합을 통해서 좀더 복잡한 조건을 만들어낼 수 있다.
		 * 논리 연산자는 and(&&), or(||), not(!)로 구성된다.
		 * && 양 변의 값이 참이면 참, 하나라도 거짓이면 거짓
		 * || 양 변의 값 중 하나라도 참이면 참 아니면 거짓
		 * ! 부정연산자라고 부르며 참을 거짓으로 거짓을 참으로 
		*/
		int x1 = 3;
		int y1 = 5;
		System.out.println(x1>2 && y1<7);
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		
		System.out.println((true || true));
		System.out.println(true || false);
		System.out.println(false || false);
		
		System.out.println(!true);
		System.out.println(!false);

		
	}

}
