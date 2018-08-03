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
				System.out.println(name + "�� �۾�����");
			}else {
				Thread.yield();	//�ٸ� �����忡�� ������ �纸�Ѵ�. �ٸ� �����忡�� �ڿ��� �Ѱ��ְ� �ڽ��� �ڿ��� �����Ѵ�.
				
			}
			
		}
		System.out.println("����");
	}
	
}
