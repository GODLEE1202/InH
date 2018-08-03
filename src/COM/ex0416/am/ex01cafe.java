package COM.ex0416.am;

import java.util.Scanner;

public class ex01cafe {

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
		for(int i =0; i<price.length; i++)
		{
			sum+= (amount[i]*price[i]);
		}
		System.out.println("���� �ݾ��� " + sum + "�Դϴ�.");
	}
	public static int[] loopOrder(String[] menu, int[] price, int[] amount, Scanner scan) {
		int x=0;
		do{
			showMenu(menu, price);
			amount  = selectItem(amount, scan);
			System.out.println("��� �ֹ��Ͻðڽ��ϱ�?");
			System.out.println("�׸��Ͻ÷��� 1�� �����ּ���");
			x = scan.nextInt();
		}while(x!=1);
		return amount;
	}
	public static void main(String[] args) {
		String[] menu = {"�Ƹ޸�ī��","ī���","���̽�Ƽ"};
		int[] price = {3000,3500,2500};
		int[] amount = new int[3];
		Scanner scan = new Scanner(System.in);
		
		amount=loopOrder(menu, price, amount, scan);
		
		for (int i = 0; i < amount.length; i++) {
			System.out.println(amount[i]);
		}
		payMoney(amount, price);
	}
}