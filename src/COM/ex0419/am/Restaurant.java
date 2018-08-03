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
		System.out.println("������� -------4000��");
		System.out.println("�丶�佺�İ�Ƽ -------3500��");
		System.out.println("�����Ľ�Ÿ -------5000��");
	}
	
	public void mainProcess() {
		loop1: while(true) {
			System.out.println("�ֹ��Ͻðڽ��ϱ�?(1.�ֹ� 2.�߰� 3.����");
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
					System.out.println("���α׷��� �����մϴ�.");
					break loop1;
			}
		}
	}
	public int checkSeat() {
		System.out.println("���° �ڸ��Դϱ�?");
		return scan.nextInt()-1;
	}
	public void takeOrder() {
		int i = checkSeat();
		if(table[i].isEmpty()){
			System.out.println("�¼��� ���ֽ��ϴ�.");
		}
		else {
			table[i].changeEmptyYN();
			System.out.println();
			getMenu();
			System.out.println("������ �ֹ��Ͻðڽ��ϱ�?");
			int num = scan.nextInt();
			System.out.println("��� �ֹ��Ͻðڽ����?");
			int count = scan.nextInt();
			table[i] = takeOrder(num , count);
		}
	}
	public void addOrder() {
		int i = checkSeat();
		if(table[i].isEmpty()){
			
		}
		else {
			System.out.println("�¼��� ����ֽ��ϴ�.");
		}
	}
	public void payMoney() {
		int i =checkSeat();
		int[] amount = table[i].getAmount();
		System.out.println("�����Ͻ� �ݾ���");
		System.out.println((amount[0]*4000)+(amount[1]*3500)+(amount[2]+5000)+"�� �Դϴ�.");
		table[i].changeEmptyYN();
		table[i].setInit();
	}
}
