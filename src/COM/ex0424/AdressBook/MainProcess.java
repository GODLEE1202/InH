package COM.ex0424.AdressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import COM.ex0425.am.Adress;

public class MainProcess {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�ּҷ� �Դϴ�.");
		AdressMethod am = new AdressMethod();
		
		while(true) {
			System.out.println("1.��ȸ   2.�߰�  3.����  4.����");
			int i = scan.nextInt();
			switch(i) {
			case 1 : am.showList();	
				break; //��ȸ
			case 2 : am.addSetter();
				break; //�߰�
			case 3 : am.modifySetter();
				break; //����
			case 4 : am.removeList();
				break; //����
			}
		}
	}
}
