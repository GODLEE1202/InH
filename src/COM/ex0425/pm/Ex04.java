package COM.ex0425.pm;

public class Ex04 {
	public static void main(String[] args) {
		try {
			System.out.println(2/2);	
		}catch (Exception e) {
			System.out.println("에러났음");
		}finally {
			System.out.println("무조건 실행되는 로직");
		}
		System.out.println("asdasd에러 노노");
		System.out.println(method1());
	}
	public static boolean method1(){
		try {
			System.out.println(0/0);
			return true;
		}catch (Exception e) {
			System.out.println("에러남");
			return false;
		}finally {
			System.out.println("무조건 실행되는 finally");
		}
		
		//System.out.println("무조건 실행됨");
	}
}
