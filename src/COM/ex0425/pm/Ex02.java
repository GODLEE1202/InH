package COM.ex0425.pm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
		System.out.println("숫자를 입력하세요");
		int i = scan.nextInt();
		System.out.println(i);
		}
		catch(InputMismatchException e) {
			System.out.println("숫자 입력하라고!!!!!!!!");
		}
	}
}
