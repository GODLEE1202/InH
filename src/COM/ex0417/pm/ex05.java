package COM.ex0417.pm;

public class ex05 {
	public static void main(String[] args) {
		/*
		 * method의 특징
		 * 선언형태 : 접근제한자 (static/ final/synchornize)특수명령어 리턴타입 메소드명 (매개변수){}
		 * 메소드는 리턴타입과 매개변수 형태에 따라 다른형질을 가진다
		 * 리턴타입이 void가 아닐 시 무조건 메소드 안에는 return이라는 명령어를 가진다.
		 * return명령어 뒤에는 로직을 넣을수 없다.
		 * 클래스 내에서 메서드는 필드의 접근이 자유로우며 다른 메서드의 접근도 가능하다.
		 *  
		 * 
		 */
		
		sampleclass sc = new sampleclass();
		sc.method1();
		sc.method2(1, "asdasd");
		sc.method3();
		sc.method4("asdvcv");
		
	}
}
