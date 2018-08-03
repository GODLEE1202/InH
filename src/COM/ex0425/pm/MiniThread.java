package COM.ex0425.pm;

public class MiniThread extends Thread{
	//쓰레드를 상속받아서 쓰는 방법
	@Override
	public void run() {
		for (int i= 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				System.out.print("ㅣ");
			}
			System.out.println();
		}
		
	}
}
