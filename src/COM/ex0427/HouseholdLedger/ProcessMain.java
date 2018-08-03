package COM.ex0427.HouseholdLedger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ProcessMain {
	Scanner scan = new Scanner(System.in);
	Map<PushDate, List<Items>> map;
	
	public ProcessMain() {
		map = new ListMaker().getMap();
		while(true) {
			if(initProcess())break;
		}
	}
	
	//날짜 추가
	public void setDate() {
		System.out.println("월을 입력해 주세요");
		int month = scan.nextInt();
		System.out.println("일을 입력해 주세요");
		int day = scan.nextInt();
		map.put(new PushDate(month,day), new ArrayList<Items>());
	}
	//아이템 추가
	public void setItem() {
		List<Items> list = searchDate();
		System.out.println("물건 이름 추가");
		String name = scan.next();
		System.out.println("원가");
		int price = scan.nextInt();
		System.out.println("수량");
		int count = scan.nextInt();
		list.add(new Items(name, price, count));
	}
	//아이템 수정
	public void modItem() {
		List<Items> list = searchDate();
		
	}
	//아이템 삭제
	public void delItem() {
		List<Items> list = searchDate();
		System.out.println("몇번째 아이템을 삭제하시겠습니까?");
		int i = scan.nextInt();
		list.remove(i);
	}
	//총계
	public void getTotal() {
		List<Items> list = searchDate();
		int sum = 0;
		for (Items items : list) {
			sum += items.getTotal();
		}
		System.out.println(sum);
	}
	//조회
	public List<Items> searchDate() {
		System.out.println("월을 입력해 주세요");
		int month = scan.nextInt();
		System.out.println("일을 입력해 주세요");
		int day = scan.nextInt();
		Set<PushDate> set = map.keySet();
		Iterator<PushDate> it = set.iterator();
		List<Items> items = null;
		while(it.hasNext()) {
			PushDate dt = it.next();
			if(dt.getDay()==day && dt.getMonth()==month) {
				items = map.get(dt);
				break;
			}
		}
		System.out.println(items);
		return items;
	}
	
	public boolean initProcess() {
		System.out.println("어떤 기능을 사용하시겠습니까?");
		System.out.println("(1.날짜추가 2.아이템추가 3.아이템수정 "
				+ "4.아이템삭제 5.총계 6.조회)");
		int x = scan.nextInt();
		switch(x) {
		case 1:
			setDate();
			break;
		case 2:
			setItem();
			break;
		case 3:
			modItem();
			break;
		case 4:
			delItem();
			break;
		case 5:
			getTotal();
			break;
		case 6:
			searchDate();
			break;
		default:
			return true;
		}
		System.out.println(map);
		return false;
	}
}





