package COM.ex0420.am;

public class Ex05 {
	/*
	 * 제네릭
	 * 받고자 하는 객체의 타입을 지정하기 위해 사용하는 임시 타입
	 * 제네릭을 통해 객체 타입을 선언함으로써 Object라는 범용적 타입 사용의 제제와 객체 타입에 대한 혼선을 막을수 있다.
	 * 보통 클래스에서 사용시 클래스 이름 뒤에 <>를 붙여 안에 원하는 타입을 대문자 영문자로 표기하는데 어떻게 표기하든 사실 상관은 없다
	 * 클래스의 <>안에 선언한 타입을 그대로 멤버변수의 타입이나 메서드의 리턴 혹은 매개변수 타입으로 사용할 수 있다.
	 * 객체 선언시 <> 안에 타입을 선언하게 되면 해당 인스턴스는 <>안에 선언한 타입을 그대로 따라간다.
	 */
	public static void main(String[] args) {
		//Box<int,float> box2 = new Box<int, float>();
		Box<String, String> box = new Box<String, String>();
		box.set("asd");
		box.setM("efgh");
		
		//String i = box.get();
		
		System.out.println(box.getT());
		System.out.println(box.getM());
	}
}
