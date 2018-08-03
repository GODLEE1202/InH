package COM.ex0425.pm;

public class RunnableThread implements Runnable{
	//두번째 방법 Runnable 인터페이스를 받아서 쓴다.
	
	@Override
	public void run() {
		for (int i= 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
		
	}
	
	
}
