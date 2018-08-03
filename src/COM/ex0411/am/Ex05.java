package COM.ex0411.am;

import java.util.Random;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//가위바위보 게임
		/*
		 *1. 플레이어의 입력값이 주어지고 컴퓨터의 랜덤값이 주어진다.
		 *2. 플레이어의 입력값과 컴퓨터의 랜덤값을 통해 가위바위보를 결정한다.
		 *3. 플레이어와 컴퓨터의 값을 비교해서 플레이어가 이겼으면 "이겼습니다" 
		 *		비겼으면 "비겼습니다." 졌으면  "졌습니다" 를 출력한다.
		 *4. 위의 로직을 전부 구성해서 완성하였다면 가위바위보 게임 오판삼선승제를 만들어 보세요
		 *5. if~ elseif~else문을 한번만을 사용하여 위의 로직을 만들어 보세요
		 */
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
				
		System.out.println("가위 바위 보를 입력하시오");
		System.out.println("0.가위 1.바위 2.보");
		
		
		int v=0;
		int l=0;
		while(true) {
			
			int num = scan.nextInt();//유저 입력
			int com = ran.nextInt(3);//com 랜덤입력
			
			System.out.println(com);
			
			if((num==0 && com==2) || (num==1 && com == 0) || (num==2&&com==1))
			{
				System.out.println("이겼습니다.");
				v++;
			}
			else if((num==0 && com==1) || (num==1 && com == 2) || (num==2 && com==0))
			{
				System.out.println("졌습니다.");
				l++;
			}
			else
			{
				System.out.println("비겼습니다.");
			}
			System.out.println("유저 승 "+v+"\t컴퓨터 승 "+l);
			
			if((v==3) || (l==3))break;//3승일때 끝
								
		}
		
	}

}
