package COM.ex0426.am;

public class Thread2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 1000000000; i++) {
			
		}
		try {
			Thread2.sleep(1500);	//1.5초 일시정지 try~catch문으로 해야함
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		for (int i = 0; i < 1000000000; i++) {
			
		}
	}
}
