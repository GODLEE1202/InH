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
//		list.add(new Ledger(2018, 4, 25, false, "���ɰ�", 5000));
//		list.add(new Ledger(2018, 4, 26, false, "���ɰ�", 5000));
//		list.add(new Ledger(2018, 4, 26, true, "�뵷", 10000));
		
		Ledger ledger1 = new Ledger();
		try {
		
			System.out.println("'�⵵'�� �Է��ϼ���");
			ledger1.setYear(scan.nextInt());
			scan.nextLine();
			
			System.out.println("'��'�� �Է��ϼ���\n");
			ledger1.setMonth(scan.nextInt());
			scan.nextLine();
			
			System.out.println("'��'�� �Է��ϼ���\n");
			ledger1.setDay(scan.nextInt());
			scan.nextLine();
			
			System.out.println("'�����̸� 0 �����̸� 1�� �Է��ϼ���\n");
			ledger1.setIncome(scan.nextInt());
			scan.nextLine();
			
			System.out.println("������ �Է��ϼ���\n");
			ledger1.setContents(scan.nextLine());
			scan.nextLine();
			
			System.out.println("�ݾ��� �Է��ϼ���\n");
			ledger1.setMoney(scan.nextInt());
			scan.nextLine();
			
			list.add(ledger1);
			
		} catch (Exception e) {
			
			System.out.println("�Է� ���� ó������ �ٽ� �Է��Ͻÿ�");
			
			new Process().addList();
		
		}
		
	}
	
	public void showList() {
		Stream<Ledger> str = list.stream();
		if(list.size()==0)System.out.println("������ �����ϴ�. ����θ� �ۼ��ϼ���");
		str.forEach(a->System.out.println(a));
	}
	
	public void modifyList() {
		showList();
		System.out.println("���° ����Ʈ�� �����Ͻðڽ��ϱ�?");
		int selectList = scan.nextInt();
		System.out.println("0.�⵵ 1.�� 2.��3.����/���� 4.���� 5.�ݾ�");
		//list.get(selectList).setYear();
//		switch (key) {
//		case value:
//			
//			break;
//
//		}
	}
	
	public void sumIncome() {
		System.out.println("0.�⵵�� ���� �հ� 1.�⵵�� ���� �հ� 2.���� ���� �հ� 3.���� ���� �հ� 4.�Ϻ� ���� �հ� 5.�Ϻ� ���� �հ�");
		int sumResult = 0;
		int y=0;
		int m=0;
		int d=0;
		switch (scan.nextInt()) {
		case 0:
			System.out.println("�⵵�� �Է��ϼ���");
			
			y= scan.nextInt();
			for (int i = 0; i < list.size(); i++) {
				if((list.get(i).getYear()==y) && (list.get(i).getIncome()!=0))
				{
					System.out.println(list.get(i).getMoney());
					sumResult += list.get(i).getMoney();
				}
			}
			System.out.println("���հ� :"+sumResult+"��");
			
			
			break;
		case 1:
			System.out.println("�⵵�� �Է��ϼ���");
			y= scan.nextInt();
			for (int i = 0; i < list.size(); i++) {
				if((list.get(i).getYear()==y) && (list.get(i).getIncome()==0))
				{
					System.out.println(list.get(i).getMoney());
					sumResult += list.get(i).getMoney();
				}
			}
			System.out.println("���հ� :"+sumResult+"��");
			break;
		case 2:
			System.out.println("�⵵�� �� �Է��ϼ���");
			y= scan.nextInt();
			System.out.println("���� �Է��ϼ���");
			m= scan.nextInt();
			
			for (int i = 0; i < list.size(); i++) {
				if((list.get(i).getYear()==y) && (list.get(i).getIncome()!=0)&& (list.get(i).getMonth()==m))
				{
					System.out.println(list.get(i).getMoney());
					sumResult += list.get(i).getMoney();
				}
			}
			System.out.println("���հ� :"+sumResult+"��");
			break;
		case 3:
			System.out.println("�⵵�� �� �Է��ϼ���");
			y= scan.nextInt();
			System.out.println("���� �Է��ϼ���");
			m= scan.nextInt();
			
			for (int i = 0; i < list.size(); i++) {
				if((list.get(i).getYear()==y) && (list.get(i).getIncome()==0) && (list.get(i).getMonth()==m))
				{
					System.out.println(list.get(i).getMoney());
					sumResult += list.get(i).getMoney();
				}
			}
			System.out.println("���հ� :"+sumResult+"��");
			break;
		case 4:
			System.out.println("�⵵�� �� �Է��ϼ���");
			y= scan.nextInt();
			System.out.println("���� �Է��ϼ���");
			m= scan.nextInt();
			System.out.println("���� �Է��ϼ���");
			d = scan.nextInt();
			
			for (int i = 0; i < list.size(); i++) {
				if((list.get(i).getYear()==y) && (list.get(i).getIncome()!=0) && (list.get(i).getMonth()==m)
						&&(list.get(i).getDay()==d))
				{
					System.out.println(list.get(i).getMoney());
					sumResult += list.get(i).getMoney();
				}
			}
			System.out.println("���հ� :"+sumResult+"��");
			
			break;
		case 5:
			System.out.println("�⵵�� �� �Է��ϼ���");
			y = scan.nextInt();
			System.out.println("���� �Է��ϼ���");
			m = scan.nextInt();
			System.out.println("���� �Է��ϼ���");
			d = scan.nextInt();
			
			for (int i = 0; i < list.size(); i++) {
				if((list.get(i).getYear()==y) && (list.get(i).getIncome()==0) && (list.get(i).getMonth()==m)
						&&(list.get(i).getDay()==d))
				{
					System.out.println(list.get(i).getMoney());
					sumResult += list.get(i).getMoney();
				}
			}
			System.out.println("���հ� :"+sumResult+"��");
			break;
		}
	}
	
	public void removeList() {
		showList();
		System.out.println("���° ����Ʈ�� ���� �Ͻðڽ��ϱ�? (1����)");
		int i = scan.nextInt() - 1;
		list.remove(i);
	}
	
	public void mainProcess(){
		while(true) {
			try {
				
				System.out.println("0.��ü ����Ʈ ���� 1.����� �ۼ��ϱ� 2.�����ϱ� 3.�����ϱ� 4.�հ� ����"+"  //���ڸ� �Է��ϼ���");
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
				System.out.println("�Է°� ���� ����� �����Ͱ� �ٳ��ư�...ó������ �ٽ� �Է��ϼ���");
				mm();
				
		}
			
	
		}
		
	}
	public void mm() {
		mainProcess();
	}
	
}
