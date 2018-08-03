package COM.ex0419.am;

public class Table {
	int[] amount= new int[3];
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
	public void setInit() {
		amount = new int[3];
	}
	public int[] getAmount() {
		return amount;
	}
}
