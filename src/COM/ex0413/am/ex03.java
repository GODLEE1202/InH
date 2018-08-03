package COM.ex0413.am;

public class ex03 {

	public static void main(String[] args) {
		//함수의 종류
		/*
		 * 1. 들어가는 값(인자값)도 반환값(리턴 값)도 존재하지 않는 함수
		 * 		함수명(ex) aaa()) 앞에 글자가 무조건 void로 선언.
		 * 2. 들어가는 값(인자값) 은 존재하지 않지만 반환값(리턴값)은 존재하는 함수
		 * 		함수의 이름 바로 앞에는 void가 아니라 반환 하려는 값의 타입을 명시한다
		 * 		함수 안에는 반드시 return이라는 명령이 존재하며 해당 명령 뒤쪽에는 우리가 반환하려는 값이 반드시 있어야 한다.
		 * 		해당 값의 타입은 반환 하려는 값의 타입과 일치해야한다.
		 * 
		 * 3. 들어가는 값(인자값)은 존재하고 반환하는 값(리턴값)은 존재하지 않는 함수
		 *  들어가는 값(인자값)은 함수의 ()안에 선언된 타입을 그대로 따ㄱ라간다
		 *  만약()안에 넣은 값과 타입이 일치하지 않으면 바로 에러가 난다
		 *  인자값의 개수는 단수개도 될수 있지만 복수개 선언도 가능하다
		 *  인자값의 개수가 복수일때 반드시 그 타입의 순서대로 값도 엏어야만 한다.
		 *  인자값은 무제한 선언이 가능하다
		 */
		//aaa();
		String s = bbb();
		System.out.println(s);
		//int i = ccc();
		//System.out.println(i);
		//System.out.println("--------------");
		//ccc();
		//ddd(i);
		//System.out.println(sum(1,2));
	}
	public static void aaa() {
		System.out.println("aaa의 함수");
	}
	public static String bbb() {
		System.out.println("ㄱㄴㄷㄻㅂ");
		return "bbb의 리턴값";
		/*
		 * return
		 * 	return이라는 명령은 호출한 곳으로 값을 반환하는 명령
		 * 또 다른 의미는 return이라는 명령은 현재 속해있는 함수의 기능을 종료한다는 의미
		 * return뒤에 로직을 실행 시킬수 없다.
		 * 
		 * 들어가는 값(인자값)도 존재하고 반환 값(리턴값)도 존재하는 함수
		 * 2번 3번 혼합
		 * 가장 많이 사용되는 함수 케이스
		 */
		
	}
	public static int ccc() {
		System.out.println("1234");
		System.out.println("321");
		return 123;
	}

	public static void ddd(int i) {
		System.out.println(i);
	}
	
	public static int sum(int i , int j)
	{
		return i+j;
	}
}
