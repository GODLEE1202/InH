package COM.ex0427.HouseholdLedger;

public class PushDate {
	private int month;
	private int day;
	public PushDate() {
		// TODO Auto-generated constructor stub
	}
	
	public PushDate(int month, int day) {
		this.month = month;
		this.day = day;
	}

	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	@Override
	public String toString() {
		return month+"/"+day;
	}
}
