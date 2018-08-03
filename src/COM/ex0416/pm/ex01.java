package COM.ex0416.pm;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] menu = {"짜장면","짬뽕","탕수육"};
		int price[]= {3500,4000,6000};
		int amount[][] = new int[5][3];		//해당 테이블마다 시킨 메뉴의 갯수
		boolean[] table = new boolean[5];	//해당 테이블이 손님이 있는지 없는지 알려주는 배열
		
		
		
		loop1 : while(true) {
			System.out.println("어떤것을 하시겠습니까?");
			System.out.println("1.주문 받기, 2.주문추가, 3. 결제");
			System.out.println("다른 키를 눌렀을 시 프로그램이 종료됩니다.");
			
			int i = scan.nextInt();
			switch(i) {
			case 1 :
				amount = takeOrder(table,menu,price,amount,scan);
				break;
			case 2 :
				amount = addOrder(table, menu, price, amount,scan);
				break;
			case 3 :
				payProcess(table, amount, price, scan);
				break;
			default :
				break loop1;
			}
		
		}
		
	System.out.println("시스템이 종료되었습니다.");	
	}
	
	
	//주문 받기
	public static int[][] takeOrder(boolean[] table, String[] menu, int[] price,int[][] amount,Scanner scan) {
		System.out.println("몇번째 테이블 입니까?(1~5)");
		int i = scan.nextInt()-1;
		
		if(table[i]) {
			System.out.println("테이블이 이미 차있습니다.");
		}
		else {
			amount[i] = loopOrder(menu,price,amount[i],scan);
			table[i] = true;
		}
		return amount;
	}
	
	//주문 추가
	public static int[][] addOrder(boolean[] table, String[] menu, int[] price,int[][] amount, Scanner scan) {
		System.out.println("몇번째 테이블 입니까?(1~5)");
		int i = scan.nextInt()-1;
		
		if(!table[i]){
			System.out.println("비어있는 테이블입니다.");
		}
		else {
			amount[i] = loopOrder(menu,price,amount[i],scan);
			table[i] = true;
		}
		return amount;
	}
	
	
	public static int[][] payProcess(boolean  table[], int amount[][], int price[],Scanner scan) {
		
		System.out.println("몇번째 테이블 입니까?(1~5)");
		int i = scan.nextInt()-1;
		int sum = 0;
		if(!table[i]){
			System.out.println("비어있는 테이블입니다.");
		}
		else {
			for (int j = 0; j < 3; j++) {
				sum += price[j]*amount[i][j];
			}
			System.out.println("총계 : "+ sum);
			table[i] = false;
			amount[i] = new int[3];
		}
		return amount;
	}
	
	
	public static int[] loopOrder(String[] menu, int[] price, int[] amount, Scanner scan) {
		int x = 0;
		do{
			showMenu(menu, price);
			amount  = selectItem(amount, scan);
			System.out.println("계속 주문하시겠습니까?");
			System.out.println("그만하시려면 1을 눌러주세요");
			x = scan.nextInt();
		}while(x != 1);
		return amount;
	}
	
	public static void showMenu(String[] menu, int[] price){
		for (int i = 0; i < price.length; i++) {
			System.out.println(i+1+"." + menu[i] + "---------------" + price[i]);
		}
	}
	public static int[] selectItem(int[] amount, Scanner scan) {
		System.out.println("어떤 메뉴를 선택하시겠습니까?");
		int i = scan.nextInt()-1;
		System.out.println("몇개를 주문하시겠습니까?");
		amount[i]= scan.nextInt();
		return amount;
	}
	public static void payMoney(int[] amount, int[] price) {
		int sum = 0;
		for(int i =0; i<price.length; i++){
			sum+= (amount[i]*price[i]);
		}
		System.out.println("결제 금액은 " + sum + "입니다.");
	}

}
