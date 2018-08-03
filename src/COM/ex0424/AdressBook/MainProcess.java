package COM.ex0424.AdressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import COM.ex0425.am.Adress;

public class MainProcess {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("주소록 입니다.");
		AdressMethod am = new AdressMethod();
		
		while(true) {
			System.out.println("1.조회   2.추가  3.수정  4.삭제");
			int i = scan.nextInt();
			switch(i) {
			case 1 : am.showList();	
				break; //조회
			case 2 : am.addSetter();
				break; //추가
			case 3 : am.modifySetter();
				break; //수정
			case 4 : am.removeList();
				break; //삭제
			}
		}
	}
}
