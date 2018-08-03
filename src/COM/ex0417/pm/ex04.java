package COM.ex0417.pm;

public class ex04 {
	public static void main(String[] args) {
		/*
		 * field의 특징
		 * field의 타입은 기본형 참도형 둘다 가능하다
		 * 필드를 초기화 시키지 않았을 경우 아래와 같이 초기화가 된다.
		 * int = 0;
		 * double =0.0;
		 * char = \u0000;
		 * boolean = false;
		 * 참조형 변수 = null;
		 * 
		 * 인스턴스
		 */
		
		sampleclass sc = new sampleclass();
		System.out.println(sc.a);
		System.out.println(sc.b);
		System.out.println(sc.c);
		System.out.println(sc.d);
		System.out.println(sc.s);
		
	}
}
