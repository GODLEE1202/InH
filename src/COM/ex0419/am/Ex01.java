package COM.ex0419.am;

public class Ex01 {
	public static void main(String[] args) {
		Dice player1 = new Dice();
		Dice player2 = new Dice();
		
		/*player1.rollDice();
		player2.rollDice();*/
		
		if(player1.getResult()>player2.getResult()) {
			System.out.println("player1 �¸�");
		}
		else if(player1.getResult()==player2.getResult()) {
			System.out.println("���º�");
		}
		else {
			System.out.println("player2 �¸�");
		}
	}
}
