package COM.ex0426.am;

public class Ex06 {
	public static void main(String[] args) {
		YeildThread yt1 = new YeildThread("Thread1");
		YeildThread yt2 = new YeildThread("Thread2");
		
		yt1.start();
		yt2.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		yt1.setWork(false);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		yt1.setWork(true);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		yt1.setStop(true);
		yt2.setStop(true);
		
	}
}
