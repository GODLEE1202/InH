package COM.ex0425.pm;

public class Ex07 {

	public static void main(String[] args) {
		//쓰레드는 3개까지 쓰는걸 권장
		
		Thread th = new MiniThread();
		//th.start();
		
		Thread th1 = new Thread(new RunnableThread());
		//th1.start();
		
		//1
		/*Runnable ra = new Runnable() {
			@Override
			public void run() {
				
				
			}
		};*/
		
		//2
		/*Runnable ra =()->{
			for (int i= 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					System.out.print("ㅣ");
				}
				System.out.println();
			}
		};*/
		
		//3
		new Thread(()-> {
			for (int i= 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					System.out.print("ㅣ");
				}
				System.out.println();
			}
		}).start();
		
		new Thread(()-> {
			for (int i= 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					System.out.print("ㅡ");
				}
				System.out.println();
			}
		}).start();
	}
}
