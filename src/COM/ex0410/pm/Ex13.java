package COM.ex0410.pm;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		/*int x = 8;
		switch(x) {
		case 1 :
		case 2:
		case 3:
			System.out.println("1~3���� ����");break;
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("4~8���� ����");break;
		case 9:
		case 10:
			*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("a�� �Է��ϼ���");
		int a = scan.nextInt();
		
		System.out.println("b�� �Է��ϼ���");
		int b = scan.nextInt();
		
		System.out.println("c�� �Է��ϼ���");
		int c = scan.nextInt();
		
		
		if((a<b && a>c)||(a>b && a<c)) {
			System.out.println(a);		
		}
		else if((b>a && b<c)||(b<a&&b>c))
		{
			System.out.println(b);
			
		}
		else if((c>a&&c<b)||(c<a&&c>b))
		{
			System.out.println(c);
		}
		
	}
}
