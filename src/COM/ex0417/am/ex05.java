package COM.ex0417.am;

public class ex05 {

	public static void main(String[] args) {
		/*
		 * 객체 지향 프로그래밍
		 * 객체를 기반으로 프로그래밍 하는 방식
		 * java는 클래스를 기반으로 객체를 생성하여 실제 프로그래밍 하는 방식을 채택
		 * 실제 객체를 생성하는 모듈을 클래스라 정의하고 해당 클래스에는 객체의 속성을 담은 멤버변수/필드 와 기능을 담은 메서드로 해당객체를 정의함
		 * java에서 생성되는 객체는 영어로 instance(인스턴스)라 정의하고 실제 인스턴스는 클래스명 이름 =new 클래스명() 형태로 선언하여 생성할수 있다
		 */
		
		car car1 = new car();
		car car2 = new car();
		car1.엑셀누르기();
		car1.브레이크누르기();
		System.out.println(car1.색깔);
		
		System.out.println(car1.연료);
		
		System.out.println(car2.연료);
		car2.색깔="빨강";
		System.out.println(car2.색깔);
		System.out.println(car1.색깔);
	
	}

}

