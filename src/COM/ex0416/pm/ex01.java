package COM.ex0416.pm;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] menu = {"¥���","«��","������"};
		int price[]= {3500,4000,6000};
		int amount[][] = new int[5][3];		//�ش� ���̺��� ��Ų �޴��� ����
		boolean[] table = new boolean[5];	//�ش� ���̺��� �մ��� �ִ��� ������ �˷��ִ� �迭
		
		
		
		loop1 : while(true) {
			System.out.println("����� �Ͻðڽ��ϱ�?");
			System.out.println("1.�ֹ� �ޱ�, 2.�ֹ��߰�, 3. ����");
			System.out.println("�ٸ� Ű�� ������ �� ���α׷��� ����˴ϴ�.");
			
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
		
	System.out.println("�ý����� ����Ǿ����ϴ�.");	
	}
	
	
	//�ֹ� �ޱ�
	public static int[][] takeOrder(boolean[] table, String[] menu, int[] price,int[][] amount,Scanner scan) {
		System.out.println("���° ���̺� �Դϱ�?(1~5)");
		int i = scan.nextInt()-1;
		
		if(table[i]) {
			System.out.println("���̺��� �̹� ���ֽ��ϴ�.");
		}
		else {
			amount[i] = loopOrder(menu,price,amount[i],scan);
			table[i] = true;
		}
		return amount;
	}
	
	//�ֹ� �߰�
	public static int[][] addOrder(boolean[] table, String[] menu, int[] price,int[][] amount, Scanner scan) {
		System.out.println("���° ���̺� �Դϱ�?(1~5)");
		int i = scan.nextInt()-1;
		
		if(!table[i]){
			System.out.println("����ִ� ���̺��Դϴ�.");
		}
		else {
			amount[i] = loopOrder(menu,price,amount[i],scan);
			table[i] = true;
		}
		return amount;
	}
	
	
	public static int[][] payProcess(boolean  table[], int amount[][], int price[],Scanner scan) {
		
		System.out.println("���° ���̺� �Դϱ�?(1~5)");
		int i = scan.nextInt()-1;
		int sum = 0;
		if(!table[i]){
			System.out.println("����ִ� ���̺��Դϴ�.");
		}
		else {
			for (int j = 0; j < 3; j++) {
				sum += price[j]*amount[i][j];
			}
			System.out.println("�Ѱ� : "+ sum);
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
			System.out.println("��� �ֹ��Ͻðڽ��ϱ�?");
			System.out.println("�׸��Ͻ÷��� 1�� �����ּ���");
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
		System.out.println("� �޴��� �����Ͻðڽ��ϱ�?");
		int i = scan.nextInt()-1;
		System.out.println("��� �ֹ��Ͻðڽ��ϱ�?");
		amount[i]= scan.nextInt();
		return amount;
	}
	public static void payMoney(int[] amount, int[] price) {
		int sum = 0;
		for(int i =0; i<price.length; i++){
			sum+= (amount[i]*price[i]);
		}
		System.out.println("���� �ݾ��� " + sum + "�Դϴ�.");
	}

}
