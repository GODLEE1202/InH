package COM.ex0411.am;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		
		for(int i = 1; i<=9; i++)
		{
			System.out.println( x + " * "+ i + " = " + (x*i));
		}
		
		
	}

}
