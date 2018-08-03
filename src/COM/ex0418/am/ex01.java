package COM.ex0418.am;

public class ex01 {
	/*
	 * this
	 * 객체 내부의 필드 혹은 메서드를 사용할때 앞에 따라오는 명령어
	 * 형식:this.필드명 , this.메서드명
	 * 필드나 메서드를 내부에서 호출할때 위의 형식처럼 호출이 가능하며 this명령은 생략 되어 질 수 있다.
	 * 단, 생성자를 호출 시 this는 생략이 불가능 하며 호출 형식은 this(매개변수)가 된다.
	 * 
	 */
	
	int a;
	String b;
	
	public ex01() {
		
	}
	
	
	public ex01(int a, String b) {
		this();
		this.a = a;
		this.b = b;
		
	}
	
	public ex01(int a) {
		this();
	}


	public void method1() {
		this.a=1;
		this.b="asd";
		this.method2();
	}
	public void method2() {
		
	}
	public void method3(int a, String b) {
		this.a = a;
		this.b = b;
		
	}
}
