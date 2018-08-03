package COM.ex0411.pm;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/*
		 * 정수를 입력받아 입력 받은 수를 거꾸로 출력하는 문제
		 * 입력의 첫 수의 개수 N개  (1<=N<=1000)
		 * 다음 줄에는 수들이 입력으로 주어진다. 각 수의 범위는 -10000 < n <10000이다.
		 * 
		 * 한줄에 입력받은 수를 거꾸로 출력한다
		 * 
		 * 입력 4
		 * -9 1 2 3
		 * 
		 * 출력
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
