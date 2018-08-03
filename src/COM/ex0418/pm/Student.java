package COM.ex0418.pm;

public class Student {
	//1. 프로젝트에 쓸 수 있는 속성을 고려할 것
	//기능이 만약 확장 될 경우 기존의 속성으로도 기능구현이 가능한지 고려한다. 만약 그렇지 아니할 경우 연산/계산을 통해서 따로 구현이 가능한가, 
	//혹은 외부의 기능으로 대체가 가능한가를 고려한 뒤 두가지 모두 해당이 안될 경우 추가 속성을 만드는것도 고려해 볼 것
	//속성은 최대한 최소화 하고 연산을 통해서 구현할 수 있는 것들은 기능형태로 구현한다.
	
	String name;
	int kor;
	int eng;
	int math;
	
	/*
	 * 생성자 사용법
	 * 생성자는 객체를 사용했을시 최소한의 세팅이 되지 않을 경우 전체적인 로직에 에러가 생길거라 판단이 될 시 재 정의한다.
	 * 생성자에 반드시 필요한 값이 존재할 시에는 기존의 디폴트 생성자를 제거하고 매개변수를 받는 생성자를 넣어준다.
	 * 단 기능 하나만으로 전체적인 로직에 문제가 발생하지 않을 경우 매개변수가 없는 생성자 안에 메서드를 선언하여 초기화 시킨다.
	 */
	public Student(String name, int kor, int eng, int math) {
		/*this.name = "홍길동";
		this.kor = 60;
		this.eng = 70;
		this.math = 65;*/
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	
	/*
	 * 메서드 사용법
	 * 기본적으로 메서드는 해당 객체가 하는 기능들을 열거하여 메서드로 만든다
	 * 해당객체에서 만약 부가적으로 필요한기능이 존재할경우 임의로 만들어서 사용한다
	 * 단 해당 기능에 필요한 속성의 접근이 어렵다 판단될 경우 다른객체에 해당 기능을 위임할 수 있다.
	 * 각각의 메서드의 기능이 중첩될 경우 중첩되는 기능을 메서드 하나로 모아 정의하고 해당 메서드를 불러서 사용하도록 한다.
	 * 
	 */
	public int getAvg(){
		//return (kor+eng+math)/3;
		return getTotal()/3;
	}
	public int getTotal() {
		return kor+eng+math;
	}
	
}
