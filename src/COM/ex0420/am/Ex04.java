package COM.ex0420.am;

public class Ex04 {
	/*
	 * 다형성(polynormal)
	 * 하나의 타입으로 여러개의 객체를 가질수 있는 형질을 의미
	 * 하나의 부모타입을 이용해서 여러개의 자식 객체를 선언할 수 있다.
	 * 부모타입으로 선언된 자식객체는 부모타입이 정의한 메서드외의 기능을 사용할 수 없다.
	 * 부모타입에서 선언하지 않은 기능을 사용하고자 할때는 강제형변환을 통해 타입을 변형시켜야 한다.
	 * 
	 */
	public static void main(String[] args) {
		TV tv1 = new TVProduct1();
		TV tv2 = new TVProduct2();
		tv1.turnONOFF();
		tv1.switchChannel();
		tv2.turnONOFF();
		tv2.switchChannel();
		//tv2.newFunction();//에러
		
		TVProduct2 tv2_1 = new TVProduct2();
		tv2_1.newFunction();
		
		((TVProduct2)tv2).newFunction();//강제 형변환
	
		//디자인패턴 : 전략패턴
		TV tv = null;
		if(5>3) {
			tv = new TVProduct1();
		}
		else {
			tv = new TVProduct2();
		}
		
	}
}
