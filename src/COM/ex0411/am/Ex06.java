package COM.ex0411.am;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1���� 2���� 3��");
		
		int player = scan.nextInt();
		int com = (int)(Math.random()*3+1);
		
		if(player==com){
			System.out.println("�����ϴ�.");
		}
		else if(player ==(com%3)+1)
		{
			System.out.println("�̰���ϴ�.");
		}
		else {
			System.out.println("�����ϴ�.");
		}
		System.out.println("player : "+ player + "\t" +"com : " + com);
		
	}

}
