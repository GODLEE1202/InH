package COM.ex0417.pm;

import java.util.Date;


//클래스 : 객체를 선언하기 위한 틀 / 클래스자체는 객체가 될수 없다.
//클래스에서 생성된 객체의 이름을 '인스턴스'라고 부른다.
public class clock {
	
	// 필드 /멤버변수
	// 객체의 속성을 나타내는 역할
	// 클래스 영역에 변수를 선언하여 해당 객체의 속성을 정의할 수 있다.
	int battery = 100;
	String shape = "원형";
	String band = "가죽";
	
	//메서드
	//객체의 기능을 나타내는 역할
	//클래스 영역에 선언한 메서드 들은 해당 객체의 기능으로써 활용된다.
	public void checkTime() {
		Date date = new Date();
		
		System.out.println(shape +"의 " + band +"으로 된 시계로");
		System.out.println("현재 시간을 확인합니다.");
		System.out.println(date);
		battery--;
	}
	public void setTimer() {
		System.out.println("타임 스타트");
		battery--;
	}
	public void lightOn() {
		System.out.println("불을 켭니다");
		battery--;
	}
}
