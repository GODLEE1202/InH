package COM.ex0426.pm;

public class Ex02 {
	
	/*
	 * 데몬 스레드
	 * 주 스레드와 종료를 함께하는 스레드
	 * 주 스레드가 종료되면 데몬 스레드도 강제적으로 종료된다.
	 * 스레드를 데몬스레드로 만들기 위해서는 스레드의 메서드인 setDeamon(true)을 이용한다. 
	 */
	
	public static void main(String[] args) {
		DeamonThread dt = new DeamonThread();
		dt.setDaemon(true);
		dt.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인 스레드 종료");
	}
}
