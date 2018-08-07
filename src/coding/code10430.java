package coding;

import java.util.Scanner;

public class Code10430 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
	    
		int num1 = (a + b) % c;
	    int num2 =  (a % c + b % c) % c;
	    int num3 = (a * b) % c;
	    int num4 = (a % c * b % c) % c;
	    System.out.println(num1 + "\n" +num2 + "\n" +num3 + "\n" +num4);
	    }
		
}
