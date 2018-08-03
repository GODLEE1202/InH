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
			//최소값보다 작은 값이 나올 경우 
			if(min>a[i])
			{
				//최소값을 해당 값으로 교체
				min=a[i];
				//모든 표식을 초기화
				for(int j=0; j< cnt.length; j++)
				{
					cnt[j]=0;
				}
				//해당 배열의 값이 초기값이라는 표식을 남김
				cnt[i]=1;
			}
			else if(min==a[i]) {
				//표식만 남김
				cnt[i]=1;
			}
		}
		
	}

}
