package COM.ex0419.am;

public class Dice {
	int d1;
	int d2;
	public Dice(){
		d1 = (int)(Math.random()*6)+1;
		d2 = (int)(Math.random()*6)+1;
	}
	/*public void rollDice() {
		d1 = (int)(Math.random()*6)+1;
		d2 = (int)(Math.random()*6)+1;
	}*/
	public int getResult() {
		return d1+d2;
	}
}
