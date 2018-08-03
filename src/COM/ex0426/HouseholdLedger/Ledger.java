package COM.ex0426.HouseholdLedger;

public class Ledger {
	private int year;	//��
	private int month;	//��
	private int day;	//��
	private int income; 	//����( true) ����(false)
	private String contents;	//����
	private int money;	//�ݾ�
	
	
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
		if(income==0) { return "����";}
		else {return "����";}
	}
	@Override
	public String toString() {
		String s = returnIncome(income);
		return year+"�� "+month+"�� "+day+"�� "+"("+ s+") " + contents + " : "+ money;
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
