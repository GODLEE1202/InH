package COM.ex0410.pm;

public class Ex06 {

	public static void main(String[] args) {
		//비트 연산자 
		/*
		 * 정수형을 2비트 형태로 연산하기 위해 쓰이는 연산자
		 * & 두자리 수의 값이 1이면 1 하나라도 0이면 0
		 * | 두자리 수의 값이 하나라도 1이면 1 아니면 0
		 * ^두 자리의 값이 같을경우 0 아니면 1
		 *  >> 맨 좌측 끝의 값에 따라서 0 혹은 1로 채우면서 오른쪽으로 이동
		 *  >>> 맨 좌측 끝의 값에 상관없이 0으로 채우면서 오른쪽 시프트
		 *  << 왼쪽으로 이동
		 */
		
		int x = 2;
		System.out.println(x <<2); //0011<<2 1000 -> 8
		System.out.println(x>>1); // 0011>>1 0001 -> 1
		
		int y = 3;
		System.out.println(x&y); //0011 & 0011 -> 2
		System.out.println(x|y); //0011 | 0011 -> 0011 => 3
		System.out.println(x^y); //0010 ^ 0011 -l>0001
		
		int z = 178;
		System.out.println(z>>>3);
		System.out.println(z>>3);
	
		
		
	}

}
