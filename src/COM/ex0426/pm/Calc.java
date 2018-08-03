package COM.ex0426.pm;

public class Calc {
	private int stock = 10000;
	
	public int getStock() {
		return stock;
	}
	
	
	public void minStock() {
		synchronized(this) {
		System.out.println("현재의 스톡 : " + stock);
		
		try {Thread.sleep(2000);} 
		catch (Exception e) {		}
		
		this.stock -= 1000;
		}
		
				
	}
	
	
}
