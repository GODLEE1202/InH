package COM.ex0410.pm;

public class Ex16 {

	public static void main(String[] args) {
		/*
		 * break;
		 * 반복문을 빠져나가기 위한 명령어
		 * 반복문 도중에 break를 만나게 되면 while문의 밖으로 나가게 된다.
		 * continue;
		 * 반복문의 특정 루프를 소거하기 위한 명령어
		 * 해당 명령어가 실행 될 경우 명령어 아래의 로직들이 전부 생략되고 루프의 처음으로 돌아온다.
		 * 주의할 점은 증감연산이 생략될 경우 무한 루프를 돌 수도 있기 떄문에 continue 문 앞에 증감연산을 두어야 한다.
		 * 
		 */
		
		
		int a = 1;
		
		while(a<=10) {
			a++;
			if(a==7)continue;
			System.out.println(a);
			//if(a==5)break;
			
		}

	}

}
