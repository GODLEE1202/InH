package COM.ex0426.HouseholdLedger;

public class Ledger {
	private int year;	//년
	private int month;	//월
	private int day;	//일
	private int income; 	//수입( true) 지출(false)
	private String contents;	//내용
	private int money;	//금액
	
	
	public Ledger() {
		
	}
	public Ledger(int year, int month, int day, int income, String contents, int money) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.income = income;
		this.contents = contents;
		this.money = money;
	}
	public String returnIncome(int income) {
		if(income==0) { return "수입";}
		else {return "지출";}
	}
	@Override
	public String toString() {
		String s = returnIncome(income);
		return year+"년 "+month+"월 "+day+"일 "+"("+ s+") " + contents + " : "+ money;
	}
	public int getYear() {return year;}
	public void setYear(int year) {this.year = year;}
	
	public int getMonth() {return month;}
	public void setMonth(int month) {this.month = month;}
	
	public int getDay() {return day;}
	public void setDay(int day) {this.day = day;}
	
	public int getIncome() {	return income;	}
	public void setIncome(int income) {	this.income = income;}
	
	public String getContents() {return contents;}
	public void setContents(String contents) {this.contents = contents;	}
	
	public int getMoney() {	return money;}
	public void setMoney(int money) {this.money = money;}

	
}	
