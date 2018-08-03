package COM.ex0420.pm;

import COM.ex0420.am.Box;

public class Ex01 {
//	int i = 1;
//	double d = 2.0;
//	
//	
	//Integer i = new Integer(2);
	public static void main(String[] args) {
		/*
		 * Wrapper Class
		 * 기본형 타입을 마치 참조형처럼 사용하기 위해 만들어진 클래스
		 * 일반적으로는 기본형 타입의 맨 앞글자를 대문자로 만들어 쓰면 그 기본형 타입의 Wrapper class가 되며 int는 Integer
		 * char는 Character로 선언해 주어야 한다.
		 * 많은 객체 중에 주소가 아닌 값에 의한 참조가 일어나는 객체 이기도 하다.
		 * 
		 */
		
		Byte a = 1;
		
		Short s = 2;
		
		Integer i = 2; //int
		
		Long l = 3L;
		
		Float f = 3.2F;

		Double d = 5.5;
		
		Character c = '가';
		
		Boolean b = false;

		int e = Integer.parseInt("12345");
		System.out.println(e+1);
		
		Integer g = 3;
		Integer h = g;
		g += 2;
		System.out.println(h);
	
		Box<Integer, String> box = new Box<Integer, String>();
		System.out.println(box);
		System.out.println(h);
	}
}
