package COM.ex0419.Restaurant;

import java.util.Scanner;

public class Restaurant {

	Scanner scan = new Scanner(System.in);
	
	Menu menu;
	Table[] table;
	
	
	public void mainProcess() {
		
	}
	
	public void setMenu() {
		System.out.println("메뉴를 몇개 생성하시겠습니까?");
		int i = scan.nextInt();
		menu = new Menu(i);
		menu.setMenuNameAndPrice();
	}
	public void takeOrder() {
		
	}
	public void addOreder() {
		
	}
	public void payMoney() {
		
	}
	public void setTableMenu(int i) {
		for (int j = 0; j < table.length; j++) {
			table[j].setAmount(i);
			
		}
	}
}
