package COM.ex0413.pm;

import java.util.Scanner;

public class cafe {
	 
	public static void main(String[] args) {
		
		//카페 관리 프로그램ver.1
		/*
		 * 손님이 오면 주문을 받는데 맨처음 메뉴를 보여준다.
		 * 손님이 상품을 선택하면 수량을 묻는다.
		 * 손님이 해당 상품의 수량을 선택하고 확인을 누르면 더 주문할 것인지 아니면 결제를 할것인지 선택한다.
		 * 만약 더 주문을 한다면 맨 처음 로직을 다시 실행하고
		 * 결제를 할경우 총 금액을 출력하고 종료한다.
		 * 
		 */
		int menu[] = {1500,2000,4000,3500,0};

		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("0. 아메리카노: 1500원\n1. 카페모카: 2000원\n2. 캬라멜마끼아또: 4000원\n3. 레몬에이드: 3500원");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			if(num == 0)
			{
				System.out.println("수량을 선택하세요");
				
				menu[4] += menu[0]*scan.nextInt();
				
				System.out.println("더 주문하시겠습니까?");
				System.out.println("0.더 주문할게요 1.아니오 계산할게요");
				
				if(scan.nextInt()==0){
					continue;
				}else{break;}
			}
			else if(num==1) {
				System.out.println("수량을 선택하세요");
				menu[4] += menu[1]*scan.nextInt();
				
				System.out.println("더 주문하시겠습니까?");
				System.out.println("0.더 주문할게요 1.아니오 계산할게요");
				if(scan.nextInt()==0){
					continue;
				}else{break;}
			}
			else if(num==2) {
				System.out.println("수량을 선택하세요");
				menu[4] += menu[2]*scan.nextInt();
				
				System.out.println("더 주문하시겠습니까?");
				System.out.println("0.더 주문할게요 1.아니오 계산할게요");
				if(scan.nextInt()==0){
					continue;
				}else{break;}
			}
			else if(num==3) {
				System.out.println("수량을 선택하세요");
				menu[4] += menu[3]*scan.nextInt();
				
				System.out.println("더 주문하시겠습니까?");
				System.out.println("0.더 주문할게요 1.아니오 계산할게요");
				if(scan.nextInt()==0){
					continue;
				}else{break;}
			}
		}
		System.out.println(menu[4]+"원 입니다.");
	}
}
