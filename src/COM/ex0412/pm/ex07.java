package COM.ex0412.pm;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		/*
		 * 문제1
		 * 숫자가 주어 졌을때 배열에 숫자를 순차적으로 입력하는 로직을 작성하세요
		 * 입력:5
		 * 배열에 들어가는 값 int[] i = {1,2,3,4,5}
		 * 
		 * 문제 2
		 * 위의 배열에서 숫자를 다시 입력받아 해당 숫자의 배수에 위치한 숫자들을 출력하세요
		 * 입력 :2
		 * a[2],a[4],a[6],a[8].....
		 * 
		 * 문제 3
		 * 입력:5
		 * 배열로 들어가는 값을 int[] i = {2,4,6,8,10}
		 * 
		 * 
		 */
		/*String s ="OOXXOXXOOO";
		char[] s = s.toCharArray();
		for (int i = 0; i< c.length; i++){
		System.out.println(c[i]);
		*/
		/*String s1 = "The Curious Case of Benjamin Button";
		String[] s2 = s1.split(" ");
		for(int i = 0; i<s2.length; i++)
		{
			System.out.println(s2[i]);
		}*/
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); //배열의 개수
		//문제 1
		int arr[] = new int[a];
		for(int i=0; i<=a-1; i++)
		{
			arr[i] = i+1;
			System.out.print(" "+arr[i]+" ");
		}System.out.println();
		
		//문제 2
		int b = scan.nextInt(); // 배열을 찾을 배수
		
		/*for(int i = 1; i < a; i++)
		{
			if( b*i <= a-1)
			{
				System.out.print(arr[b*i]+" ");	
			}
			
		}*/
		for(int i = b; b<arr.length; i+=b)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println();
		//문제 3
		int c = scan.nextInt();
		int arr2[] = new int[c];
		for(int i=1; i<=c-1; i++)
		{
			arr2[i]= i*2;
			System.out.print(arr2[i]+" ");
		}
		
		
	
	
	}

}
