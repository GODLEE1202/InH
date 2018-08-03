package COM.ex0425.pm;

import java.util.InputMismatchException;

public class Ex05 {
	/*
	 * throws 
	 * ���� �޼��忡�� �Ͼ�� ���ܻ�Ȳ�� ���� �޼������ ó���ϰ� �Ǹ� �������� try~catch�� ���ξ��Ѵ�.
	 * ���� �޼���� ������ ������ �������� �����ϰ� ���� ó���� �����޼��忡�� ó���ϱ� ���� ������ �����޼���� �������� throws��� ����� ����Ѵ�.
	 * ����: �޼��� ����� throws ���ܵ�{}
	 * ������ �� : ���� �޼��忡�� throws�� ��õ� �������� �ǵ��� ���� �޼��忡�� ����ȭ�Ͽ� ó���ϵ��� �����Ѵ�.
	 */
	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		ex05.method1();
	}
	public void method1() {
		try {
			method2();
		} catch (InputMismatchException e) {
			System.out.println("�̰��� �޼ҵ�2���� ����Ų ����");
		} catch (ArithmeticException e) {
			System.out.println("�̰��� �޼ҵ�2���� ����Ų ����2");
		} catch (Exception e) {
			System.out.println("�̰��� �޼ҵ�2���� ����Ų ����3");
		}
		
	}
	public void method2() throws ArithmeticException, InputMismatchException, Exception{
		
		System.out.println(0/0);
	}
}
