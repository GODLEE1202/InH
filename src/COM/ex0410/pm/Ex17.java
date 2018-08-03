package COM.ex0410.pm;

public class Ex17 {

	public static void main(String[] args) {
		/*
		 * 다중 반복문
		 * 반복문 안에 반복문이 들어가 있는 형태
		 * 반복문에서 반복문으로 들어갈때 안의 반복문이 실행이 끝나게 되면 밖의 반복문을 실행한다.
		 * 다중 반복문은 데이터가 많고 뎁스가 깊어서 접근이 어려울 경우 혹은 엄청난 양의 리스트데이터를 출력시에 사용하기도 한다.
		 * 단, 다중 반복문은 컴퓨터의 리소스를 많이 잡아먹으니 너무 남발하지 말것
		 * 
		 */
		
		
		
		int a = 1;
		int b=1;
		
		while(a<6)
		{
			while(b<6) {
				System.out.print(b+"   ");
				b++;
					
			}
			System.out.println();
			b=1;
			
			a++;
			
		}
	}

}
