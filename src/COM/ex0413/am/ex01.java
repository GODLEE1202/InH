package COM.ex0413.am;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com = (int)(Math.random()*100+1);
		//System.out.println(com);
		int p1=7;
		int p2=7;
		for(int i =1; i<8; i++){
			//플레이어 1
			System.out.print("player1 : ");
			int player1 = scan.nextInt();
			if(player1>com){
				p1= p1-1;
				System.out.println("down  " + p1);
			}
			else if(player1<com){
				p1= p1-1;
				System.out.println("up  " + p1);
			}
			else{
				System.out.println("Great!! You Win!!");
				break;
			}
			if(i==7){
				System.out.println("Game Over!!");
			}
			//플레이어2
			System.out.print("player2 : ");
			int player2 = scan.nextInt();
			
			if(player2>com){
				p2=p2-1;
				System.out.println("down  " + p2);
			}
			else if(player2<com){
				p2 = p2-1;
				System.out.println("up  " + p2);
			}
			else{
				System.out.println("Great!! You Win!!");
				break;
			}
			if(i==7){
				System.out.println("Game Over!!");
			}
		}
	}
}
