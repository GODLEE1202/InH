package COM.ex0416.pm;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		
		for(int i=1; i>0; i++)
		{
			if(X%3 == 0) {
				X= X/3;
			}
			else if(X%2 == 0) {
				X= X/2;
			}
			else {
				X--;
			}
			if(X==1)
			{
				System.out.println(i);
				break;
			}
		}
		
	}
	
	
}
