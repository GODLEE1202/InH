package COM.ex0410.pm;

import java.util.Scanner;

public class Ex11 {

	/*
	 * if ~ else if ~ else 
	 * if ������ ���� �������� �����ϰ��� �� ��� ����ϴ� ����
	 * �ϳ��� �������δ� �б⸦ ��Ű�� ��ɤ� ��� ���
	 * if�� ���ǽ� �ܿ� �� ������ ���� ���ǽ��� else if �� �־������ν� ���������� ������ ���ϵ��� �Ѵ�.
	 * �ش� ������ ������ �� ���� �񱳸� �ϴٰ� �����ϴ� ������ ���ð�� �ش� ������ ���� �ϰ� �����Ѵ�.
	 * ������ ���� �Ŀ��� �Ʒ��ִ� ���ǵ��� ���� ���õȴ�.
	 * ���� if(���ǽ�){}else if(���ǽ�){}....else{}
	 * ���� ��� ������ �������� ���� ��� �ǾƷ��� else������ �ξ� � ���ǵ� ���� ��Ű�� ���� ��츦 ���� �� �� �ִ�.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		
		int score = scan.nextInt();
		
		if(score>= 90) {
			System.out.println("A");
		}
		else if(score >= 80)
		{
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("C");
		}
		else if (score >= 60 ) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
}
