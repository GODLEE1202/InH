package COM.ex0410.pm;

public class Ex05 {

	public static void main(String[] args) {
		//논리 연산자 
		/*
		 * 우변의 연산이 실행되지 않는 조건 
		 * && 앞의 결과값이 거짓이면 우변의 연산을 수행하지 않는다.
		 * || 앞의 결과값이 참이면 우변의 연산을 수행하지 않는다.
		 * 
		 */
		int x = 3;
		int y = 5;
		
		System.out.println(((x+=2)>4) && ((y-=3)<3));
		System.out.println(x);
		System.out.println(y);
		
		int x1 =3;
		int y1 = 5;
		System.out.println((x1+=2)<4 && (y1-=3)<3);
		System.out.println(x1);
		System.out.println(y1);
		

		int x2 = 3;
		int y2 = 5;
		System.out.println((x2+=2)>4 ||(y2-=3)<3);
		System.out.println(x2);
		System.out.println(y2);

	}

}
