package COM.ex0425.pm;

public class Ex04 {
	public static void main(String[] args) {
		try {
			System.out.println(2/2);	
		}catch (Exception e) {
			System.out.println("��������");
		}finally {
			System.out.println("������ ����Ǵ� ����");
		}
		System.out.println("asdasd���� ���");
		System.out.println(method1());
	}
	public static boolean method1(){
		try {
			System.out.println(0/0);
			return true;
		}catch (Exception e) {
			System.out.println("������");
			return false;
		}finally {
			System.out.println("������ ����Ǵ� finally");
		}
		
		//System.out.println("������ �����");
	}
}
