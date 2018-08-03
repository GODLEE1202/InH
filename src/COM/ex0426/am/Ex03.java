package COM.ex0426.am;

public class Ex03 {
	/*
	 * 스레드 생명 주기
	 * 스레드는 태어나면서 소명할 떄까지의 생명 주기를 가지며 스레드는 각 생명 주기마다 일정한 상태를 가진다
	 * 그래서 각 상태는 NEW, BUNNALBLE, BLOCKED, WAITING/TIMED+WAITING, TERMINATED라는 상태를 가진다.
	 * new: 동기화 생성되었지만 아직 start()를 통해서 실항되지 않는 상태
	 * RUNNABLE: 실행 중 혹은 실행 가능한 상태
	 * BLOCKED : 동기화 블럭에 의해서 일시 정지된 상태
	 * WAITING : 스레드의 작업이 종료되지는 않았지만 실행가능하지 않은 일시정지된 상태
	 * TERMINATED: 스레드의 작업이 종료된 상태
	 */
	public static void main(String[] args) {
		Thread2 th2 = new Thread2();
		
		Thread.State state = th2.getState();
		
		System.out.println(th2.getState());
		
		th2.start();
		System.out.println(th2.getState());
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(th2.getState());
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(th2.getState());
	}
}
