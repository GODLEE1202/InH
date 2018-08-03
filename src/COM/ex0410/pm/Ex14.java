package COM.ex0410.pm;

public class Ex14 {

	public static void main(String[] args) {
		/*
		 * java에서 사용되는 대표적인 반복문 중에 하나
		 * 조건식이 true이면 안의 문장을 계속 반복을 하고 false일 경우 안의 문장을 실행하지 않고 밖으로 나와 다음문장을 실행시킨다.
		 * while문은 잘못할 경우 무한 루프를 돌 수 있기 떄문에 반드시 카운트 변수와 증감연산을 같이 사용하여 무한루프를 돌지 않도록 신경써야 한다.
		 * 
		 * 형식: while(조건식){로직}
		 * 
		 * 
		 */
		int x = 1;
		
		
		while(x<=5) {
			System.out.println("안녕하세요 반갑습니다.");
			x++;
			
		}
		
		
		

	}

}
