package COM.ex0410.pm;

public class Ex18 {

	public static void main(String[] args) {
		/*
		 * for 
		 * 자바의 또 다른 반복문 중 하나 
		 * while문처럼 조건문만 넣는 형식과는 달리 for문은 괄호 안에 초기값, 조건식, 증감연산 3개가 다들어간다.
		 * 동작하는 방식은 초기화 이후 조건식으로 비교를 하고 수행할 문장을 실행한 뒤에 증감식을 실행시킨뒤 다시 조건식으로 와서 비교하는 루프를 가진다.
		 * 초기값과 증감연산은 for문 안쪽에 위치하기 때문에 while문보다 해당 값에 대한 고려를 덜해도 상관이 없다.
		 * break문과 continue문을 사용시 while문보다 for문을 사용하는것이 좋다.
		 * for문의 초기화 조건식 증감연산은 모두 생략이 가능하다.
		 * 단 조건식이 생략되면 while문의 조건식이 true인것처럼 간주가 된다.
		 * 
		 */
		
		
		/*for(int i = 1; i<=5; i++) {
			System.out.println("안녕하세요 반갑습니다.");
		}*/
		
		for(int a=1; a<=10; a++) {
			if(a==5)continue;
			System.out.println(a);
			if(a == 9)break;
		
		}
	}

}
