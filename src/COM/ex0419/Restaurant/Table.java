package COM.ex0419.Restaurant;

public class Table {
	int[] amount;
	boolean emptyYN;
	
	public void takeOrder(int i, int count){
		amount[i] += count;
	}
	
	public boolean isEmpty() {
		return emptyYN;
	}
	public void changeEmptyYN() {
		emptyYN = !emptyYN;
	}
	public void setAmount(int i) {
		amount = new int[i];
	}
}
