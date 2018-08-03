package COM.ex0425.pm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	
	/*
	 * ����ó��
	 * ���� : ���α׷� �ڵ忡 ���ؼ� ���� �� �� �ִ� �ټ� �̾��� ����
	 * ���α׷����� �Ǽ��� ��Ÿ���� �ڵ��� ������ �ƴ� �ܺ��� ��Ȳ�� ���� ������ ��� ���ܷ� ����.
	 * ���ܴ� �ݵ�� ó���Ǿ�� �ϸ� �̷� ���ܸ� ó���� �� �ִ� ����� java���� �����Ѵ�.
	 * java������ ���ܸ� �ΰ��� ������� ó���� �����ѵ� 
	 * 1.try~catch
	 * 2.throws
	 * �� ó�� ����
	 * 
	 * try~catch�� try���忡 ������ �� ������ �־��ְ� catch�� �ش繮�忡�� �Ͼ ���ܸ� �����Ͽ� �ش� ���ܿ� ���� ������ �־��ش�.
	 * ���� try{���ܰ� �߻��� ����}
	 * catch(������ Ŭ���� ������){���ܸ� ó���� ����}
	 * catch���� �������� ������ ������ �׻� �� �������� Exception�� ��ġ��Ű�°��� �����Ѵ�.
	 * Exception�� ��� ����Ŭ������ �θ�Ŭ�����̰� exception�� catch�� ������ ���� ��� 
	 * �ٸ� ���� Ŭ������ �¿�� ���⿡ Exception�� �ִ� catch���� �׻� �� �������� �����ϵ��� �Ѵ�.
	 * 
	 */
	
	
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			int i = scan.nextInt();
			System.out.println(0/0);	
		}
//		catch(Exception e3) {		Exception�� ����ó��Ŭ������ �θ�Ŭ������ ���� �����Ұ�� �ؿ� ������ ó���� �ȵ� �׷��� �׻� �Ʒ��ʿ� ����
//			System.out.println("���� �𸣰����� ������ ����!!");
//		}		
		catch (ArithmeticException e1) {
			System.out.println("�̻��� ���� ������");
		}
		catch (InputMismatchException e2) {
			System.out.println("���� �Է��϶��");
		}
		catch(Exception e3) {
			System.out.println("���� �𸣰����� ������ ����!!");
		}
		
	}
}
