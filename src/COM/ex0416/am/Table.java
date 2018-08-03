package COM.ex0416.am;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int table[] = new int[10];//테이블 갯수
		
		int tableTotalPrice[] = new int[10];
		String menu[] = {"1.삼겹살", "2.오겹살", "3.가브리살","4.목살", "5.소등심","6.참이슬","7.하이트"};
		int price[] = {8000,10000,15000,13000,20000,4000,4000}; //메뉴별 가격
		int amount[] = new int[7];	//메뉴별 수량
		
		tableOrder(table, tableTotalPrice, menu, amount, price, scan);
	}
	
	public static void showmenu(String[] menu, int[] price)
	{
		System.out.println("메뉴"+"\t\t"+"가격");
		for (int i = 0; i < price.length; i++) {
			
			System.out.println(menu[i]+"\t\t"+price[i]);
		}
	}
	
	public static void tableOrder(int table[],int tableTotalPrice[], String menu[],int amount[], int price[],Scanner scan)
	{
		int tableNum;
		while(true){
			System.out.println("1.손님 or 2.계산");
			if(scan.nextInt()==1)//손님이라면
			{
				for(int j =0;j<table.length;j++) {
					System.out.print(j+"번 테이블"+"("+table[j]+")"+"   ");		//테이블에 자리가 있는지
					System.out.println();
				}
				tableNum = scan.nextInt();//몇번 테이블에 앉을것인지
				tableWhile : while(true) {
					if(table[tableNum]==0) {				//테이블에 사람이 없다면
						table[tableNum] = 1;				//테이블에 앉으면 배열에 1을 넣어서 자리 있는지 체크
						
						System.out.println("주문하시겠습니까?");
						while(true)
						{
							showmenu(menu,price);
							System.out.println("메뉴를 선택해주세요.");
							int menuNum = scan.nextInt();
							System.out.println("수량을 선택해주세요");
							amount[menuNum]= price[menuNum]*scan.nextInt();//amount에 가격*수량 값을 넣는다.
							System.out.println("더 주문하시겠습니까? 0.네, 더 주문할게요 / 1.아니오, 필요없습니다.");
							if(scan.nextInt()==0)continue;
							else {
								tableTotalPrice[tableNum] = amount[menuNum]; //총금액(테이블)에 메뉴가격을 넣는다
								break tableWhile;
							}
						}
					}
					
					else{								//테이블에 사람이 있다면
						System.out.println("자리에 손님이 이미 있습니다.");
						break;
					}
				}
			}
			else {
				System.out.println("몇번 테이블 계산?");
				tableNum = scan.nextInt();
				System.out.println(tableTotalPrice[tableNum]);
				table[tableNum]=0;
			}
			
		}
		
	}
}
