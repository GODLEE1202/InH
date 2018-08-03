package COM.ex0419.am;

import java.util.Scanner;

public class Restaurant {

	Scanner scan = new Scanner(System.in);
	Table[] table = new Table[5];
	public Restaurant() {
		for (int i = 0; i < table.length; i++) {
			table[i] = new Table();
		}
	}
	public void getMenu() {
		System.out.println("까르보나라 -------4000원");
		System.out.println("토마토스파게티 -------3500원");
		System.out.println("봉골레파스타 -------5000원");
	}
	
	public void mainProcess() {
		loop1: while(true) {
			System.out.println("주문하시겠습니까?(1.주문 2.추가 3.결제");
			int i = scan.nextInt();
			switch(i) {
			case 1:
				takeOrder();
				break;
			
			case 2:
				addOrder();
				break;
			case 3:
				payMoney();
				break;
			default:
					System.out.println("프로그램을 종료합니다.");
					break loop1;
			}
		}
	}
	public int checkSeat() {
		System.out.println("몇번째 자리입니까?");
		return scan.nextInt()-1;
	}
	public void takeOrder() {
		int i = checkSeat();
		if(table[i].isEmpty()){
			System.out.println("좌석이 차있습니다.");
		}
		else {
			table[i].changeEmptyYN();
			System.out.println();
			getMenu();
			System.out.println("무엇을 주문하시겠습니까?");
			int num = scan.nextInt();
			System.out.println("몇개를 주문하시겠스빈까?");
			int count = scan.nextInt();
			table[i] = takeOrder(num , count);
		}
	}
	public void addOrder() {
		int i = checkSeat();
		if(table[i].isEmpty()){
			
		}
		else {
			System.out.println("좌석이 비어있습니다.");
		}
	}
	public void payMoney() {
		int i =checkSeat();
		int[] amount = table[i].getAmount();
		System.out.println("결제하실 금액은");
		System.out.println((amount[0]*4000)+(amount[1]*3500)+(amount[2]+5000)+"원 입니다.");
		table[i].changeEmptyYN();
		table[i].setInit();
	}
}
