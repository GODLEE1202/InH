package COM.ex0413.pm;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.nextLine();
		String s = scan.next();
		
		if(s.equals("+"))
		{
			sum(a,b);
		}
		else if(s.equals("-")) {
			min(a,b);
		}
		else if(s.equals("*")) {
			mul(a,b);
		}
		else if(s.equals("/")) {
			div(a,b);
		}
		
	}
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	public static void min(int a, int b) {
		System.out.println(a-b);
	}
	public static void mul(int a, int b) {
		System.out.println(a*b);
	}
	public static void div(int a, int b) {
		System.out.println(a/b);
	}
}
