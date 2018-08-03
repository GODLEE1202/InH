package COM.ex0411.am;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1가위 2바위 3보");
		
		int player = scan.nextInt();
		int com = (int)(Math.random()*3+1);
		
		if(player==com){
			System.out.println("비겼습니다.");
		}
		else if(player ==(com%3)+1)
		{
			System.out.println("이겼습니다.");
		}
		else {
			System.out.println("졌습니다.");
		}
		System.out.println("player : "+ player + "\t" +"com : " + com);
		
	}

}
