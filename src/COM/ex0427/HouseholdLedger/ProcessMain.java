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
	
	//��¥ �߰�
	public void setDate() {
		System.out.println("���� �Է��� �ּ���");
		int month = scan.nextInt();
		System.out.println("���� �Է��� �ּ���");
		int day = scan.nextInt();
		map.put(new PushDate(month,day), new ArrayList<Items>());
	}
	//������ �߰�
	public void setItem() {
		List<Items> list = searchDate();
		System.out.println("���� �̸� �߰�");
		String name = scan.next();
		System.out.println("����");
		int price = scan.nextInt();
		System.out.println("����");
		int count = scan.nextInt();
		list.add(new Items(name, price, count));
	}
	//������ ����
	public void modItem() {
		List<Items> list = searchDate();
		
	}
	//������ ����
	public void delItem() {
		List<Items> list = searchDate();
		System.out.println("���° �������� �����Ͻðڽ��ϱ�?");
		int i = scan.nextInt();
		list.remove(i);
	}
	//�Ѱ�
	public void getTotal() {
		List<Items> list = searchDate();
		int sum = 0;
		for (Items items : list) {
			sum += items.getTotal();
		}
		System.out.println(sum);
	}
	//��ȸ
	public List<Items> searchDate() {
		System.out.println("���� �Է��� �ּ���");
		int month = scan.nextInt();
		System.out.println("���� �Է��� �ּ���");
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
		System.out.println("� ����� ����Ͻðڽ��ϱ�?");
		System.out.println("(1.��¥�߰� 2.�������߰� 3.�����ۼ��� "
				+ "4.�����ۻ��� 5.�Ѱ� 6.��ȸ)");
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





