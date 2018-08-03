package COM.ex0423.pm;

public class Ex04Enum {

	/*
	 * 열거형(Enum)
	 * 새로운 데이터 타입의 일종
	 * 열거형은 클래스 선언부에 class대신 enum 을 넣어 선언한다.
	 * 열거타입은 클래스 영역에 선언되어지는 타입이며 반드시 변수를 선언하여 사용해야 한다.
	 * 
	 */
	
	public String name;
	public int size;
		
	public Type type;
	
	
	public static void main(String[] args) {
		Ex04Enum ex04 = new Ex04Enum();
		Ex04Enum ex04_1 = new Ex04Enum();
		
		ex04.name = "나이키";
		ex04.size = 255;
		System.out.println("신발이름"+ ex04.name);
		System.out.println("신발사이즈"+ ex04.size);
		
		ex04.type = Type.HIKING;
		System.out.println("신발 종류"+ex04.type);
		
		ex04_1.type = Type.HIKING;
		System.out.println(ex04.type == ex04_1.type);
		
	}
}
