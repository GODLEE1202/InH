package COM.ex0411.pm;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/*
		 * ������ �Է¹޾� �Է� ���� ���� �Ųٷ� ����ϴ� ����
		 * �Է��� ù ���� ���� N��  (1<=N<=1000)
		 * ���� �ٿ��� ������ �Է����� �־�����. �� ���� ������ -10000 < n <10000�̴�.
		 * 
		 * ���ٿ� �Է¹��� ���� �Ųٷ� ����Ѵ�
		 * 
		 * �Է� 4
		 * -9 1 2 3
		 * 
		 * ���
		 * 3 2 1 -9
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		
		int[] arr = new int[i];
		
		for(int j=0; j<i; j++)
		{
			arr[j] = scan.nextInt();
		}
		
		for(int j=i-1; j>=0; j--)
		{
			System.out.println(arr[j]);
		}
			
			
			
			
	}

}
