package COM.ex0426.am;

public class StartThread extends Thread {
	private Thread2 th;
	public StartThread(Thread2 th) {
	this.th = th;	
	}
	
	@Override
	public void run() {
	
		while (true) {
		Thread.State state = th.getState();
		System.out.println("타겟 스레드 상태 : " + state);
		
		if(state == Thread.State.NEW)th.start();
		
		if(state == Thread.State.TERMINATED)break;
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}
}
