package COM.ex0427.HouseholdLedger;

public class Items {
	private String objName;
	private int price;
	private int count;
	private int total;
	public Items() {
		// TODO Auto-generated constructor stub
	}
	
	public Items(String objName, int price, int count) {
		this.objName = objName;
		this.price = price;
		this.count = count;
		this.total = price*count;
	}


	public String getObjName() {
		return objName;
	}
	public void setObjName(String objName) {
		this.objName = objName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = price*count;
	}

	@Override
	public String toString() {
		return "이름=" + objName + ", 원가=" + price 
				+ ", 수량=" + count + ", 총액=" + total + "\n";
	}
	
	
}
