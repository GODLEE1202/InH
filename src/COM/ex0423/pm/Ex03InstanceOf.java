package COM.ex0423.pm;

public class Ex03InstanceOf {
	
	/*
	 * instanceof
	 * 해당 객체의 부모 객체를 확인하고자 할 경우 쓰이는 명령어
	 * 해당 객체의 부모객체가 맞을 경우는 true 아니면 false
	 * 비교대상이 되는 개체가 좌측에 비교할 부모객체는 오른쪽에 위치한다.
	 * 1.5 초중반에 많이 사용됨
	 * 
	 */
	
	public static void main(String[] args) {
		TvProduct tv = new TvProduct();
		if(tv instanceof TV)
		{
			System.out.println("해당 객체는 TV의 자식객체입니다.");
		}
	}
	
}
