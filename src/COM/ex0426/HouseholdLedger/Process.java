package COM.ex0426.HouseholdLedger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Process {
	List<Ledger> list = new ArrayList<Ledger>();
	Scanner scan = new Scanner(System.in); 

	public void addList() {
//		list.add(new Ledger(2018, 4, 25, false, "점심값", 5000));
//		list.add(new Ledger(2018, 4, 26, false, "점심값", 5000));
//		list.add(new Ledger(2018, 4, 26, true, "용돈", 10000));
		
		Ledger ledger1 = new Ledger();
		try {
		
			System.out.println("'년도'를 입력하세요");
			ledger1.setYear(scan.nextInt());
			scan.nextLine();
			
			System.out.println("'월'를 입력하세요\n");
			ledger1.setMonth(scan.nextInt());
			scan.nextLine();
			
			System.out.println("'일'를 입력하세요\n");
			ledger1.setDay(scan.nextInt());
			scan.nextLine();
			
			System.out.println("'수입이면 0 지출이면 1를 입력하세요\n");
			ledger1.setIncome(scan.nextInt());
			scan.nextLine();
			
			System.out.println("내용을 입력하세요\n");
			ledger1.setContents(scan.nextLine());
			scan.nextLine();
			
			System.out.println("금액을 입력하세요\n");
			ledger1.setMoney(scan.nextInt());
			scan.nextLine();
			
			list.add(ledger1);
			
		} catch (Exception e) {
			
			System.out.println("입력 오류 처음부터 다시 입력하시오");
			
			new Process().addList();
		
		}
		
	}
	
	public void showList() {
		Stream<Ledger> str = list.stream();
		if(list.size()==0)System.out.println("내용이 없습니다. 가계부를 작성하세요");
		str.forEach(a->System.out.println(a));
	}
	
	public void modifyList() {
		showList();
		System.out.println("몇번째 리스트를 수정하시겠습니까?");
		int selectList = scan.nextInt();
		System.out.println("0.년도 1.월 2.일3.수입/지출 4.내용 5.금액");
		//list.get(selectList).setYear();
//		switch (key) {
//		case value:
//			
//			break;
//
//		}
	}
	
	public void sumIncome() {
		System.out.println("0.년도별 지출 합계 1.년도별 수입 합계 2.월별 지출 합계 3.월별 수입 합계 4.일별 지출 합계 5.일별 수입 합계");
		int sumResult = 0;
		int y=0;
		int m=0;
		int d=0;
		switch (scan.nextInt()) {
		case 0:
			System.out.println("년도를 입력하세요");
			
			y= scan.nextInt();
			for (int i = 0; i < list.size(); i++) {
				if((list.get(i).getYear()==y) && (list.get(i).getIncome()!=0))
				{
					System.out.println(list.get(i).getMoney());
					sumResult += list.get(i).getMoney();
				}
			}
			System.out.println("총합계 :"+sumResult+"원");
			
			
			break;
		case 1:
			System.out.println("년도를 입력하세요");
			y= scan.nextInt();
			for (int i = 0; i < list.size(); i++) {
				if((list.get(i).getYear()==y) && (list.get(i).getIncome()==0))
				{
					System.out.println(list.get(i).getMoney());
					sumResult += list.get(i).getMoney();
				}
			}
			System.out.println("총합계 :"+sumResult+"원");
			break;
		case 2:
			System.out.println("년도를 을 입력하세요");
			y= scan.nextInt();
			System.out.println("월을 입력하세요");
			m= scan.nextInt();
			
			for (int i = 0; i < list.size(); i++) {
				if((list.get(i).getYear()==y) && (list.get(i).getIncome()!=0)&& (list.get(i).getMonth()==m))
				{
					System.out.println(list.get(i).getMoney());
					sumResult += list.get(i).getMoney();
				}
			}
			System.out.println("총합계 :"+sumResult+"원");
			break;
		case 3:
			System.out.println("년도를 을 입력하세요");
			y= scan.nextInt();
			System.out.println("월을 입력하세요");
			m= scan.nextInt();
			
			for (int i = 0; i < list.size(); i++) {
				if((list.get(i).getYear()==y) && (list.get(i).getIncome()==0) && (list.get(i).getMonth()==m))
				{
					System.out.println(list.get(i).getMoney());
					sumResult += list.get(i).getMoney();
				}
			}
			System.out.println("총합계 :"+sumResult+"원");
			break;
		case 4:
			System.out.println("년도를 을 입력하세요");
			y= scan.nextInt();
			System.out.println("월을 입력하세요");
			m= scan.nextInt();
			System.out.println("일을 입력하세요");
			d = scan.nextInt();
			
			for (int i = 0; i < list.size(); i++) {
				if((list.get(i).getYear()==y) && (list.get(i).getIncome()!=0) && (list.get(i).getMonth()==m)
						&&(list.get(i).getDay()==d))
				{
					System.out.println(list.get(i).getMoney());
					sumResult += list.get(i).getMoney();
				}
			}
			System.out.println("총합계 :"+sumResult+"원");
			
			break;
		case 5:
			System.out.println("년도를 을 입력하세요");
			y = scan.nextInt();
			System.out.println("월을 입력하세요");
			m = scan.nextInt();
			System.out.println("일을 입력하세요");
			d = scan.nextInt();
			
			for (int i = 0; i < list.size(); i++) {
				if((list.get(i).getYear()==y) && (list.get(i).getIncome()==0) && (list.get(i).getMonth()==m)
						&&(list.get(i).getDay()==d))
				{
					System.out.println(list.get(i).getMoney());
					sumResult += list.get(i).getMoney();
				}
			}
			System.out.println("총합계 :"+sumResult+"원");
			break;
		}
	}
	
	public void removeList() {
		showList();
		System.out.println("몇번째 리스트를 삭제 하시겠습니까? (1부터)");
		int i = scan.nextInt() - 1;
		list.remove(i);
	}
	
	public void mainProcess(){
		while(true) {
			try {
				
				System.out.println("0.전체 리스트 보기 1.가계부 작성하기 2.수정하기 3.삭제하기 4.합계 보기"+"  //숫자를 입력하세요");
				int i =scan.nextInt();
				switch (i) {
				case 0:
					showList();
					break;
					
				case 1:
					addList();
					break;	
					
				case 2:
					modifyList();
					break;
					
				case 3:
					removeList();
					break;
				case 4:
					sumIncome();
					break;
				}
				
			} catch (Exception e) {
				System.out.println("입력값 오류 저장된 데이터값 다날아감...처음부터 다시 입력하세요");
				mm();
				
		}
			
	
		}
		
	}
	public void mm() {
		mainProcess();
	}
	
}
