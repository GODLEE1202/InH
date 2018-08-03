package COM.ex0410.pm;

import java.util.Scanner;

public class Ex10 {

	//중첩 if문
	/*
	 * if문 안에 if문을 넣어 사용하는 형태
	 * if문 안에 넣을 수 있는 if문의 깊이는 한계가 없다.
	 * 대전제 조건이 있고 부 전제로 깔리는 조건이 각 대전제 마다 다를경우 중첩 if문을 사용하는 것이 좋다.
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		if(a>60){
			if(a>70) {
				if(a>80) {
					if (a>90) {
						System.out.println("A학점");
					}
					else {
						System.out.println("B학점");
					}
				}
				else {
					System.out.println("C학점");
				}
			}
			else {
				System.out.println("D학점");
			}
		}
		else
		{
			System.out.println("F학점");
		}
	}
}
