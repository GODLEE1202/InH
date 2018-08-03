package COM.ex0418.am;

public class ex02 {
	/*
	 * 생성자 사용방법
	 * 필드의 초기화 혹은 객체의 초기화시 사용되는 메서드
	 * 생성자 안에서는 다른 생성자를 호출 할 수 있고 또한 일반 메서드 호출이 가능하다.
	 * 일반 메서드는 생성자의 호출이 불가능하다.
	 * 생성자는 생성자를 호출할 수 있지만 생성자의 호출이 순환반복 되는 경우 에러가 나므로 주의.
	 * 
	 */
	public ex02() {
		this(1);
		System.out.println("안녕하세요");
		method1();
		
	}
	public ex02(int a) {
		this(1,2);
		
		System.out.println("zzzzzz");
		//this(1,2);//에러
	
	}
	public ex02(int a, int b) {
		//this();//루프가 돌면 안된다.
		System.out.println("asdasdasdasd");
	}
	public ex02(int a,int b, int c) {
		this(2);
	}
	
	
	public void method1() {
		//this();//에러
		
	}
}
