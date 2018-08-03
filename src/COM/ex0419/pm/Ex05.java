package COM.ex0419.pm;

public class Ex05 {
	public static void main(String[] args) {
		//AbstractClass ac = new AbstractClass();
		/*
		 * 추상클래스(Abstract 클래스)
		 * 추상클래스는 일부의 기능이 정의되어 있지 않은 ㅋ믈래스를 의미한다.
		 * 클래스의 선언부에 abstract를 넣어 선언하고 추상화 시킬 메서드의 선언부에 abstract명령을 넣어 추상 메서드를 구현한다.
		 * 자식 클래스는 추상클래스를 상속 받을시 추상 클래스가 구현하지 않은 추상 메서드를 강제로 어버라이드 받아 구현해야 한다
		 * 추상클래스는 인스턴스 선언이 불가능하며 반드시 추상클래스를 상속받은 자식클래스를 통해 인스턴스를 선언해야 한다.
		 *  
		 *  추상클래스에서 추상크래스를 상속받았을 시 상위  추상클래스에서 선언한 추상메서드를 
		 *  하위 추상클래스에서 강제적으로 받아 구현할 필요는 없다
		 *  
		 *  하지만 일반 클래스에서 해당 자식 추상 클래스를 상속 받았을 시 해당 추상 클래스가 상속 받고 있던 
		 *  모든 상위의 추상 클래스가 선언한 추상 메서드들을 
		 *  일반 클래스 에서 강제로 오버라이드 받아 구현해야한다. 
		 *  
		 */
		ChildClass cc = new ChildClass();
		ChildClass1 cc1 = new ChildClass1();
		cc.method2();
		cc1.method2();
	
	}
}
