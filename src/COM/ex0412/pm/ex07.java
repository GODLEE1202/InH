package COM.ex0412.pm;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		/*
		 * ����1
		 * ���ڰ� �־� ������ �迭�� ���ڸ� ���������� �Է��ϴ� ������ �ۼ��ϼ���
		 * �Է�:5
		 * �迭�� ���� �� int[] i = {1,2,3,4,5}
		 * 
		 * ���� 2
		 * ���� �迭���� ���ڸ� �ٽ� �Է¹޾� �ش� ������ ����� ��ġ�� ���ڵ��� ����ϼ���
		 * �Է� :2
		 * a[2],a[4],a[6],a[8].....
		 * 
		 * ���� 3
		 * �Է�:5
		 * �迭�� ���� ���� int[] i = {2,4,6,8,10}
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
		
		int a = scan.nextInt(); //�迭�� ����
		//���� 1
		int arr[] = new int[a];
		for(int i=0; i<=a-1; i++)
		{
			arr[i] = i+1;
			System.out.print(" "+arr[i]+" ");
		}System.out.println();
		
		//���� 2
		int b = scan.nextInt(); // �迭�� ã�� ���
		
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
		//���� 3
		int c = scan.nextInt();
		int arr2[] = new int[c];
		for(int i=1; i<=c-1; i++)
		{
			arr2[i]= i*2;
			System.out.print(arr2[i]+" ");
		}
		
		
	
	
	}

}
