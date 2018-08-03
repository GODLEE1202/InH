package COM.ex0426.am;

public class YeildThread extends Thread{
	String name;
	private boolean stop = false;
	private boolean work = true;
	
	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public boolean isWork() {
		return work;
	}

	public void setWork(boolean work) {
		this.work = work;
	}

	public YeildThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		while(!stop)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(work)
			{
				System.out.println(name + "의 작업내용");
			}else {
				Thread.yield();	//다른 스레드에게 실행을 양보한다. 다른 스레드에게 자원을 넘겨주고 자신의 자원을 포기한다.
				
			}
			
		}
		System.out.println("종료");
	}
	
}
