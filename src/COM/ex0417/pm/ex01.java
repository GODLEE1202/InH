package COM.ex0417.pm;

public class ex01 {

	public static void main(String[] args) {
		
		//인스턴스 선언방법
		// 인스턴스란 자바에서 생성된 객체를 부르는 이름
		//형식 : 클래스명 이름(변수이름) = new 생성자메서드();
		clock ck1 = new clock();
		
		//인스턴스 필드 접근 방법
		// 형식 : 인스턴스명.필드명
		System.out.println(ck1.battery);
		System.out.println(ck1.band);
		System.out.println(ck1.shape);
		
		ck1.shape = "네모난 모양";
		System.out.println(ck1.shape);
		
		//인스턴스 메서드 접근방법
		//형식 : 인스턴스명.메서드형(인자값)
		ck1.checkTime();
		ck1.lightOn();
		ck1.setTimer();
		System.out.println(ck1.battery);
		
		
	}

}
