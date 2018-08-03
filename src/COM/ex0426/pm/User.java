package COM.ex0426.pm;

public class User extends Thread{
	private Calc calc;
	private String name;
	
	public User(Calc calc, String name) {
		this.calc = calc;
		this.name = name;
		
	}
	
	@Override
	public void run() {
		calc.minStock();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	System.out.println(name+ "이 인출한 후 스톡 : "+ calc.getStock());
	}
}
