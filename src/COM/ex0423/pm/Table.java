package COM.ex0423.pm;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;




public class Table {
	Map<String,Integer> amount;
	Map<String,Integer> menu;
	Scanner scan = new Scanner(System.in);
	
	public Table() {
		amount = new HashMap <String,Integer>();
		menu = new HashMap <String, Integer>();
		
		menu.put("닭갈비", 5000);
		menu.put("생선까스", 4000);
		menu.put("소세지야채볶음", 6000);
		
		amount.put("닭갈비", 0);
		amount.put("생선까스", 0);
		amount.put("소세지야채볶음", 0);
		doProcess();
		
	}
	
	public void addCnt(String menu, int cnt) {
		amount.put(menu, amount.get(menu)+cnt);
	}
	public void doProcess() {
		System.out.println("주문하시겠습니까? 1. 주문  2. 추가  3.결제");
		int x = scan.nextInt();
		switch(x){
			case 1:
			case 2:takeOrder(); 
					break;
			default : payMoney();
		}
	}
	public void takeOrder() {
		while(true) {
			System.out.println("무엇을 주문하시겠습니까?");
//			menu.keySet();
//			menu.values();
			Set<Entry<String, Integer>> es = menu.entrySet();
			System.out.println(es);
			String s = scan.next();
			scan.nextLine();
			System.out.println("몇개를 주문하시겠습니까?");
			int cnt = scan.nextInt();
			addCnt(s,cnt);
			
			System.out.println("계속 주문하시겠습니까?(나가시려면  1을 눌러주세요)");
			int yn = scan.nextInt();
			if(yn==1)break;
		}
	}
	public void payMoney() {
		Set<String> menuName = menu.keySet();
		Iterator<String> it = menuName.iterator();
		int total = 0;
		
		while(it.hasNext()){
			String str = it.next();
			total += menu.get(str)*amount.get(str);
		}
		System.out.println("총액은 "+total+"원 입니다.");
		
	}
	@Override
	public String toString() {
		
		Set<Entry<String,Integer>> es = amount.entrySet();
		
		return es.toString();
	}
}
