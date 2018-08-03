package COM.ex0410.pm;

public class Ex12 {

	public static void main(String[] args) {
		/*
		 * switch ~ case
		 * if else if else 문장처럼 사용할 수 있는 또 다른 조건문
		 * switch에 들어가는 비교값은 변수이며 조건식이 올 수 없다.
		 * case문과 비교하려는 값은 오로지 값과 변수의 동등 비교만이 가능하며 비교 연산을 통한 참 거짓 판별은 불가능하다.
		 * case문에서 변수와 동등 비교시 해당 case를 만족할 경우 해당case의 로직 뿐 아니라 아래있는 로직들도 실행 하게 된다.
		 * 이를 방지 하기 위해 break문을 사용하는데 break문 사용시 switch~ case문 자체를 빠져나간다.
		 * if문 보다 분기를 태우는 속도가 더 빠르므로 간략하게 조건을 명시하여 분기처리를 할 시에는 switch를 쓰는것이 좋다.
		 * 만약 어떠한 case도 만족시키지 못했을 경우 맨아래에 default를 두어 if문의 else 처럼 예외처리를 할수 있다. 
		 */
		
		
		int x = 6;
		
		
		switch(x) {
		case 1:
			System.out.println(11111);break;
		case 2:
			System.out.println(22222);break;
		case 3:
			System.out.println(33333);break;
		case 4:
			System.out.println(44444);break;
		case 5:
			System.out.println(55555);
		default:
			System.out.println("Default");
		
		}
		

	}

}
