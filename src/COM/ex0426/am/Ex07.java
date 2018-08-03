package COM.ex0426.am;

public class Ex07 {
	public static void main(String[] args) {
		SumThread sum = new SumThread();
		sum.start();
		
		/*try {
			sum.join();		//.join() 해당 스레드의 종료를 기다리는 메서드
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		for (int i = 0; i <1000; i++) {
			System.out.println("총합 : " + sum.getSum());	
			
		}
			
		
	}
}
