package COM.ex0411.pm;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) 
	{
		/*
		 * 5ũ���� �迭�� ������ּ���
		 * 5ũ���� �迭 �ȿ� 1,2,3,4,5�� �־��ּ���
		 * �ش� �迭���� �ε��� 0,2,4��° ���� ����� �ּ���
		 * �ε��� 3��°�� ���� 9�� �ٲ��ּ���
		 * ��ü �迭�� ���� �ε��� 0���� 4���� ������� ������ּ���
		 * ��ü �迭�� ���� �ε��� 0���� 4���� �������� ������ּ���
		 * 
		 */
		/*int[] arr = {1,2,3,4,5};
		System.out.println(arr[0]+" : " + arr[2] + " : " + arr[4]);
		arr[3] = 9;
		
		System.out.println("������� ���");
		for(int i=0; i<=(arr.length)-1; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("�������� ���");
		for(int i = (arr.length)-1; i >=0; i--)
		{
			System.out.println(arr[i]);
		}
		*/
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = 0; // ���� ����
	    int t = 0;// �ּҰ����� �迭 �ڸ��� �ֱ�����

	    int[] arr = new int[n];                 //������ ���� �迭

	    int[] min = new int[n];                 //�ּҰ� ���� �迭 

	    for(int i=0; i<=n-1; i++)               //0���� �Է��� ���ڱ����� �迭�� �������� �ִ� for��
	    {
	        arr[i] = (int)(Math.random()*5+1);

	        System.out.print(" " + arr[i]);
	    }

	    //�ּҰ��� ��ó�� �迭(���� �ּҰ�)�� ���� �迭�� ���Ͽ� �ּҰ��� ��      
	    for(int i=0; i<= n-1; i++)//�ּ� �� ã��
	    {
	        if(i == n-1)
	            break;

	        if(arr[k] > arr[(i+1)])
	        {
	            k = i+1;
	            i = 0;
	        }   
	    }

	    for(int i=0; i<= n-1; i++)//ã�� �ּҰ��� ������ ������ �ִ���
	    {               
	        if(arr[k] == arr[(i)])
	        {
	            min[t] = i;
	            t++;
	        }   
	    }

	    System.out.println("\t�ּҰ� : " + arr[k]);
	    System.out.println("������ �ּҰ��� ���� : " + (t));
	    
	    
	    for(int j = 0; j <= t-1; j++)
	    {
	        System.out.println("�ּҰ� �迭�� �ڸ� : " + (min[j]+1));
	    }
	}
	}

