package COM.ex0416.am;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int table[] = new int[10];//���̺� ����
		
		int tableTotalPrice[] = new int[10];
		String menu[] = {"1.����", "2.�����", "3.���긮��","4.���", "5.�ҵ��","6.���̽�","7.����Ʈ"};
		int price[] = {8000,10000,15000,13000,20000,4000,4000}; //�޴��� ����
		int amount[] = new int[7];	//�޴��� ����
		
		tableOrder(table, tableTotalPrice, menu, amount, price, scan);
	}
	
	public static void showmenu(String[] menu, int[] price)
	{
		System.out.println("�޴�"+"\t\t"+"����");
		for (int i = 0; i < price.length; i++) {
			
			System.out.println(menu[i]+"\t\t"+price[i]);
		}
	}
	
	public static void tableOrder(int table[],int tableTotalPrice[], String menu[],int amount[], int price[],Scanner scan)
	{
		int tableNum;
		while(true){
			System.out.println("1.�մ� or 2.���");
			if(scan.nextInt()==1)//�մ��̶��
			{
				for(int j =0;j<table.length;j++) {
					System.out.print(j+"�� ���̺�"+"("+table[j]+")"+"   ");		//���̺� �ڸ��� �ִ���
					System.out.println();
				}
				tableNum = scan.nextInt();//��� ���̺� ����������
				tableWhile : while(true) {
					if(table[tableNum]==0) {				//���̺� ����� ���ٸ�
						table[tableNum] = 1;				//���̺� ������ �迭�� 1�� �־ �ڸ� �ִ��� üũ
						
						System.out.println("�ֹ��Ͻðڽ��ϱ�?");
						while(true)
						{
							showmenu(menu,price);
							System.out.println("�޴��� �������ּ���.");
							int menuNum = scan.nextInt();
							System.out.println("������ �������ּ���");
							amount[menuNum]= price[menuNum]*scan.nextInt();//amount�� ����*���� ���� �ִ´�.
							System.out.println("�� �ֹ��Ͻðڽ��ϱ�? 0.��, �� �ֹ��ҰԿ� / 1.�ƴϿ�, �ʿ�����ϴ�.");
							if(scan.nextInt()==0)continue;
							else {
								tableTotalPrice[tableNum] = amount[menuNum]; //�ѱݾ�(���̺�)�� �޴������� �ִ´�
								break tableWhile;
							}
						}
					}
					
					else{								//���̺� ����� �ִٸ�
						System.out.println("�ڸ��� �մ��� �̹� �ֽ��ϴ�.");
						break;
					}
				}
			}
			else {
				System.out.println("��� ���̺� ���?");
				tableNum = scan.nextInt();
				System.out.println(tableTotalPrice[tableNum]);
				table[tableNum]=0;
			}
			
		}
		
	}
}
