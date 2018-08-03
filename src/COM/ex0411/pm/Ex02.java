package COM.ex0411.pm;

public class Ex02 {

	public static void main(String[] args) {
	/*
	 * 변수의 생존범위
	 * 변수는 선언될 시에 태어나고 변수가 위치한 곳의 {}가 끝나는 지점까지 생존한다.
	 * 브레이스{}를 나간 직후 소멸된 변수는 접근이 불가능하다.
	 * if , for문 등 브레이스를 쓰는 모든것들에는 변수의 생존범위가 존재한다.
	 * for문의 경우 괄호 안쪽에서 카운트 변수를 선언했을 시 해당 변수의 소멸은 for문을 빠져나갔을때 소멸된다.
	 * for문의 카운트 변수를 계속 유지시키고 싶다면 for 문 앞에 카운트 변수를 먼저 선언하고 해당 카운트 변수를 for문 안에서 초기화 시키는 방법이 있다. 
	 */
		int i = 0;
		if(i==0) {
			
			int j =2;
			System.out.println(i);
			System.out.println(j);
			
		}
		System.out.println(i);
		//System.out.println(j);
		
		/////////////////////////////////////////////
		
		for(int j =0; j<2; j++)
		{
			System.out.println(j);
		}
		//System.out.println(j);
	
	///////////////////////////////////////////////////
		
		
	
	
	}
	

}
