package COM.ex0410.pm;

import java.util.Scanner;

public class Ex10 {

	//��ø if��
	/*
	 * if�� �ȿ� if���� �־� ����ϴ� ����
	 * if�� �ȿ� ���� �� �ִ� if���� ���̴� �Ѱ谡 ����.
	 * ������ ������ �ְ� �� ������ �򸮴� ������ �� ������ ���� �ٸ���� ��ø if���� ����ϴ� ���� ����.
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		if(a>60){
			if(a>70) {
				if(a>80) {
					if (a>90) {
						System.out.println("A����");
					}
					else {
						System.out.println("B����");
					}
				}
				else {
					System.out.println("C����");
				}
			}
			else {
				System.out.println("D����");
			}
		}
		else
		{
			System.out.println("F����");
		}
	}
}
