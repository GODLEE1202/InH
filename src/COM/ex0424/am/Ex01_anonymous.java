package COM.ex0424.am;

public class Ex01_anonymous {
	/*
	 * 익명클래스 (Anonymous Class)
	 * 이름이 없는 일회용 클래스
	 * 인스턴스 선언 시 인스턴스의 변수가 없는 값만 선언된 형태
	 * 단 하나의 객체를 일회용 식으로 사용할 경우 쓰는 인스턴스 생성방식이다.
	 * 인스턴스를 한번만 호출해도 상관이 없을 경우 사용한다.
	 *  
	 */
	
	
	int a;
	public Ex01_anonymous() {
		a = 1;
		method1();
	}
	public void method1() {
		
	}
	public void method2(Ex01_anonymous ex01) {
		
	}
	public static void main(String[] args) {
		//Ex01_anonymous ex01 = new Ex01_anonymous();
		new Ex01_anonymous().method1();	//변수 이름을 지우고 선언만 하고 .method1에서 한번만 쓸것이니까
		new Ex01_anonymous();
		
		/*Ex01_anonymous ex01 = new Ex01_anonymous();
		new Ex01_anonymous().method2(ex01);
		*/
		
		new Ex01_anonymous().method2(new Ex01_anonymous());
		
	}
}
