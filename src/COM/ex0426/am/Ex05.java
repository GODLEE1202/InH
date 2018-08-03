package COM.ex0426.am;

public class Ex05 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
			
			try {
				Thread.sleep(500);	//주어진 시간동안 일시 정지(단위는 millisecond
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}
