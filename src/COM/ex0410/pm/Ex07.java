package COM.ex0410.pm;

public class Ex07 {

	public static void main(String[] args) {
		
		//비교 논리식의 조합을 통해 받고자 하는 값을 달리 지정하는 연산자
		/*
		 * 조건식 참일때 값: 거짓일때 값
		 * 연산자 중에셔 유일하게 조건 분기를 하는 연산자.
		 * 나중에 해당 유용성이 점차 부각되는 연산자이기도 함
		 * 
		 */
		
		
		int x = 5;
		int y = 3;
		int z= (x>y)?x:y;

		System.out.println(z);
		z = (x<y)?x:y;
		System.out.println(z);
	}

}
