package COM.ex0419.pm;

public class Ex01_override {

	public static void main(String[] args) {
		/*
		 * 상속(inherite)
		 * 한 객체의 속성과 기능을 다른 객체가 고스란히 물려받는 것
		 * 상속받은 객체는 선언 없이 물려받은 객체의 속성과 기능을 사용할수 있다.
		 * 맨 마지막에 상속을 받은 객체는 모든 상위의 부모객체의 속성과 기능을 전부 물려받는다
		 * 
		 *  
		 *  오버라이드(override)
		 *  자식객체에서 부모객체의 기능을 그대로 덮어쓰는 것
		 *  부모객체가 갖고있는 메서드의 선언을 고스란히 자식객체에서 선언하여 새로 기능을 작성한다..
		 *  자식객체에서 오버라이드된 기능을 사용할 경우 부모객체에서 물려받은 기능이 아닌 자식 
		 *  객체에서 새로 선언한 오버라이드 메서드가 실행된다.
		 *  
		 *  
		 *  super
		 *  자신의 필드나 메서드를 접근하고자 할 때 사용하는 this처럼 부모의 기능이나 속성에 접근하고자 할 경우 사용하는 명령어
		 *  자식객체 쪽에서 부모의 기능이나 속성에 접근하고자 할 시 super.메서드명 (), super.필드명; 이런 식으로 접근이 가능하다.
		 *  부모의 생성자에 접근할 경우 super(인자값)으로 접근이 가능하다
		 *  
		 *  ##부모클래스의 생성자는 상속되지 않으며 참조를 통해 유지가 가능하다. 
		 *  
		 *  
		 *  object
		 *  모든객체의 부모클래스
		 *  모든객체는 object가 가진 기능을 쓸 수 있다.
		 *  java.lang 패키지 안에 위치해 이씅며 실제로 해당 패키지 안에 존재하는 모든 클래스는 import명령 없이 사용이 가능하다.
		 *  
		 */
		SM3 sM3 = new SM3(1);
		sM3.accelator();
		sM3.putBreak();
		
		
		SM5 sm5 = new SM5();
		sm5.accelator();
		sm5.putBreak();
		sm5.heating();
		sm5.accelatorPast();
		
		SM7 sm7 = new SM7();
		
		
		
		
	}
	

}
