package COM.ex0412.pm;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] cnt= new int[n];
		int min = 99999;
		
		for(int i = 0; i< a.length; i++)
		{
			a[i]= scan.nextInt();
		}
		
		for( int i = 0; i<a.length; i++)
		{
			//�ּҰ����� ���� ���� ���� ��� 
			if(min>a[i])
			{
				//�ּҰ��� �ش� ������ ��ü
				min=a[i];
				//��� ǥ���� �ʱ�ȭ
				for(int j=0; j< cnt.length; j++)
				{
					cnt[j]=0;
				}
				//�ش� �迭�� ���� �ʱⰪ�̶�� ǥ���� ����
				cnt[i]=1;
			}
			else if(min==a[i]) {
				//ǥ�ĸ� ����
				cnt[i]=1;
			}
		}
		
	}

}
