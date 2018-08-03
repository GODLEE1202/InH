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
		
		menu.put("�߰���", 5000);
		menu.put("�����", 4000);
		menu.put("�Ҽ�����ä����", 6000);
		
		amount.put("�߰���", 0);
		amount.put("�����", 0);
		amount.put("�Ҽ�����ä����", 0);
		doProcess();
		
	}
	
	public void addCnt(String menu, int cnt) {
		amount.put(menu, amount.get(menu)+cnt);
	}
	public void doProcess() {
		System.out.println("�ֹ��Ͻðڽ��ϱ�? 1. �ֹ�  2. �߰�  3.����");
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
			System.out.println("������ �ֹ��Ͻðڽ��ϱ�?");
//			menu.keySet();
//			menu.values();
			Set<Entry<String, Integer>> es = menu.entrySet();
			System.out.println(es);
			String s = scan.next();
			scan.nextLine();
			System.out.println("��� �ֹ��Ͻðڽ��ϱ�?");
			int cnt = scan.nextInt();
			addCnt(s,cnt);
			
			System.out.println("��� �ֹ��Ͻðڽ��ϱ�?(�����÷���  1�� �����ּ���)");
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
		System.out.println("�Ѿ��� "+total+"�� �Դϴ�.");
		
	}
	@Override
	public String toString() {
		
		Set<Entry<String,Integer>> es = amount.entrySet();
		
		return es.toString();
	}
}
