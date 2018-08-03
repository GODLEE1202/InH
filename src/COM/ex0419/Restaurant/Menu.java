package COM.ex0419.Restaurant;

import java.util.Scanner;

public class Menu {
	Scanner scan = new Scanner(System.in);
	String[] menuName;
	int[] price;
	public Menu(int i) {
		setCount(i);
		setMenuNameAndPrice();
	}

	public void setCount(int i ) {
		menuName = new String[i];
		price = new int[i];
	}
	
	public void setMenuNameAndPrice() {
		for (int i = 0; i < menuName.length; i++) {
			System.out.println("이름을 입력해주세요");
			menuName[i] = scan.nextLine();
			System.out.println(menuName[i]+"의 가격을 입력해주세요");
			price[i] = scan.nextInt();
		}
	}
	public void showMenu() {
		for (int i = 0; i < menuName.length; i++) {
			System.out.println(menuName[i]+"-------------"+price[i]+"원");
		}
	}
}
