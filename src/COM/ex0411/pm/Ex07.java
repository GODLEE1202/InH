package COM.ex0411.pm;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) 
	{
		/*
		 * 5크기의 배열을 만들어주세요
		 * 5크기의 배열 안에 1,2,3,4,5를 넣어주세요
		 * 해당 배열에서 인덱스 0,2,4번째 값을 출력해 주세요
		 * 인덱스 3번째의 값은 9로 바꿔주세요
		 * 전체 배열의 값을 인덱스 0부터 4까지 순서대로 출력해주세요
		 * 전체 배열의 값을 인덱스 0부터 4까지 역순으로 출력해주세요
		 * 
		 */
		/*int[] arr = {1,2,3,4,5};
		System.out.println(arr[0]+" : " + arr[2] + " : " + arr[4]);
		arr[3] = 9;
		
		System.out.println("순서대로 출력");
		for(int i=0; i<=(arr.length)-1; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("역순으로 출력");
		for(int i = (arr.length)-1; i >=0; i--)
		{
			System.out.println(arr[i]);
		}
		*/
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = 0; // 시작 변수
	    int t = 0;// 최소값들의 배열 자리를 넣기위함

	    int[] arr = new int[n];                 //랜덤값 넣을 배열

	    int[] min = new int[n];                 //최소값 넣을 배열 

	    for(int i=0; i<=n-1; i++)               //0부터 입력한 숫자까지의 배열에 랜덤값을 넣는 for문
	    {
	        arr[i] = (int)(Math.random()*5+1);

	        System.out.print(" " + arr[i]);
	    }

	    //최소값은 맨처음 배열(최초 최소값)과 다음 배열을 비교하여 최소값을 비교      
	    for(int i=0; i<= n-1; i++)//최소 값 찾기
	    {
	        if(i == n-1)
	            break;

	        if(arr[k] > arr[(i+1)])
	        {
	            k = i+1;
	            i = 0;
	        }   
	    }

	    for(int i=0; i<= n-1; i++)//찾은 최소값과 동일한 변수가 있는지
	    {               
	        if(arr[k] == arr[(i)])
	        {
	            min[t] = i;
	            t++;
	        }   
	    }

	    System.out.println("\t최소값 : " + arr[k]);
	    System.out.println("동일한 최소값의 갯수 : " + (t));
	    
	    
	    for(int j = 0; j <= t-1; j++)
	    {
	        System.out.println("최소값 배열의 자리 : " + (min[j]+1));
	    }
	}
	}

