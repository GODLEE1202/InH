package COM.ex0410.pm;

import java.util.Scanner;

public class Ex11 {

	/*
	 * if ~ else if ~ else 
	 * if 문장을 여러 조건으로 수행하고자 할 경우 사용하는 문장
	 * 하나의 조건으로는 분기를 시키기 어령ㄹ 경우 사용
	 * if의 조건식 외에 그 다음에 오는 조건식인 else if 를 넣어줌으로써 순차적으로 조건을 비교하도록 한다.
	 * 해당 조건이 만족할 때 까지 비교를 하다가 만족하는 조건이 나올경우 해당 로직을 실행 하고 종료한다.
	 * 로직을 실행 후에는 아래있는 조건들은 전부 무시된다.
	 * 형식 if(조건식){}else if(조건식){}....else{}
	 * 만약 모든 조건을 만족하지 못할 경우 맨아래에 else문장을 두어 어떤 조건도 실행 시키지 못할 경우를 방지 할 수 있다.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		
		int score = scan.nextInt();
		
		if(score>= 90) {
			System.out.println("A");
		}
		else if(score >= 80)
		{
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("C");
		}
		else if (score >= 60 ) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
}
