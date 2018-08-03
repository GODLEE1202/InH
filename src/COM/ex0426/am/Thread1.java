package COM.ex0426.am;

public class Thread1 extends Thread{
	String name;
	
	public Thread1(String name) {
		this.name = name;
	}
		@Override
	public void run() {
		for (int i = 0; i <20000; i++) {
			System.out.println(name);
		}
		super.run();
	}
	
}
