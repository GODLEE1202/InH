package COM.ex0425.pm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
		System.out.println("���ڸ� �Է��ϼ���");
		int i = scan.nextInt();
		System.out.println(i);
		}
		catch(InputMismatchException e) {
			System.out.println("���� �Է��϶��!!!!!!!!");
		}
	}
}
