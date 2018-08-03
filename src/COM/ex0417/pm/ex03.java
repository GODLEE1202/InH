package COM.ex0417.pm;

public class ex03 {
	
	public static void main(String[] args) {
		
		/*
		 * 레퍼런스 타입과 프리미티브 타입
		 * 1. 프리미티브 타입(기본형)
		 * 우리가 java에서 기본형이라 불리우는 타입을 총칭하는 말
		 * 프리미티브 타입은 값을 기준으로 움직이는 타입이다
		 * 주소에 의한 참조가 아닌 값에 의한 참조가 일어남
		 * 값이 참조된 두개의 변수가 있을때 하나의 변수의 값을 바꿔도 다른 변수의 값이 같이 바뀌진 않는다.
		 * 독립적으로 값을 사용하기 때문에 서로에게 영향을 미치지 않음
		 * 값의 유지를 위해서는 값의 빈번한 이동을 필요로 함
		 * 
		 * 2. 레퍼런스 타입(참조형)
		 * 흔히 자바에서 참조형이라 불리는 타입
		 * 해당 타입은 값에 바로 접근되는 것이 아니라 주소에 의한 참조를 통해 값에 접근이 된다.
		 * 하나의 주소를 참조하는 두개의 변수가 존재 시 하나의 변수를 통해 값을 변경하게 되면 나머지 변수도 전부 영향을 받는다.
		 * 주소가 공유되는 한 값이 계속 유지가 되며 주소가 끊기면 값은 그대로 소실이 된다.
		 * 값의 유지가 프리미티브 타입보다 쉽다.
		 * 
		 * 
		 */
		
		
		clock ck1 = new clock();
		System.out.println(ck1);
		
		clock ck2 = ck1;
		ck2.battery = 80;
		System.out.println(ck1.battery);
		System.out.println(ck2.battery); 		//주소
		
		
		
		int[] a = new int[5];
		System.out.println(a);
		int[] b = a;							//주소
		b[3] = 5;								
		System.out.println(a[3]);
		
		int i =3;								//값
		int j =i;
		System.out.println(i);
		System.out.println(j);
	}

	
}
