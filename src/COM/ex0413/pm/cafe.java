package COM.ex0413.pm;

import java.util.Scanner;

public class cafe {
	 
	public static void main(String[] args) {
		
		//ī�� ���� ���α׷�ver.1
		/*
		 * �մ��� ���� �ֹ��� �޴µ� ��ó�� �޴��� �����ش�.
		 * �մ��� ��ǰ�� �����ϸ� ������ ���´�.
		 * �մ��� �ش� ��ǰ�� ������ �����ϰ� Ȯ���� ������ �� �ֹ��� ������ �ƴϸ� ������ �Ұ����� �����Ѵ�.
		 * ���� �� �ֹ��� �Ѵٸ� �� ó�� ������ �ٽ� �����ϰ�
		 * ������ �Ұ�� �� �ݾ��� ����ϰ� �����Ѵ�.
		 * 
		 */
		int menu[] = {1500,2000,4000,3500,0};

		while(true) {
			System.out.println("�޴��� �����ϼ���");
			System.out.println("0. �Ƹ޸�ī��: 1500��\n1. ī���ī: 2000��\n2. ļ��Ḷ���ƶ�: 4000��\n3. �����̵�: 3500��");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			if(num == 0)
			{
				System.out.println("������ �����ϼ���");
				
				menu[4] += menu[0]*scan.nextInt();
				
				System.out.println("�� �ֹ��Ͻðڽ��ϱ�?");
				System.out.println("0.�� �ֹ��ҰԿ� 1.�ƴϿ� ����ҰԿ�");
				
				if(scan.nextInt()==0){
					continue;
				}else{break;}
			}
			else if(num==1) {
				System.out.println("������ �����ϼ���");
				menu[4] += menu[1]*scan.nextInt();
				
				System.out.println("�� �ֹ��Ͻðڽ��ϱ�?");
				System.out.println("0.�� �ֹ��ҰԿ� 1.�ƴϿ� ����ҰԿ�");
				if(scan.nextInt()==0){
					continue;
				}else{break;}
			}
			else if(num==2) {
				System.out.println("������ �����ϼ���");
				menu[4] += menu[2]*scan.nextInt();
				
				System.out.println("�� �ֹ��Ͻðڽ��ϱ�?");
				System.out.println("0.�� �ֹ��ҰԿ� 1.�ƴϿ� ����ҰԿ�");
				if(scan.nextInt()==0){
					continue;
				}else{break;}
			}
			else if(num==3) {
				System.out.println("������ �����ϼ���");
				menu[4] += menu[3]*scan.nextInt();
				
				System.out.println("�� �ֹ��Ͻðڽ��ϱ�?");
				System.out.println("0.�� �ֹ��ҰԿ� 1.�ƴϿ� ����ҰԿ�");
				if(scan.nextInt()==0){
					continue;
				}else{break;}
			}
		}
		System.out.println(menu[4]+"�� �Դϴ�.");
	}
}
