package COM.ex0411.am;

import java.util.Random;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//���������� ����
		/*
		 *1. �÷��̾��� �Է°��� �־����� ��ǻ���� �������� �־�����.
		 *2. �÷��̾��� �Է°��� ��ǻ���� �������� ���� ������������ �����Ѵ�.
		 *3. �÷��̾�� ��ǻ���� ���� ���ؼ� �÷��̾ �̰����� "�̰���ϴ�" 
		 *		������� "�����ϴ�." ������  "�����ϴ�" �� ����Ѵ�.
		 *4. ���� ������ ���� �����ؼ� �ϼ��Ͽ��ٸ� ���������� ���� ���ǻＱ������ ����� ������
		 *5. if~ elseif~else���� �ѹ����� ����Ͽ� ���� ������ ����� ������
		 */
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
				
		System.out.println("���� ���� ���� �Է��Ͻÿ�");
		System.out.println("0.���� 1.���� 2.��");
		
		
		int v=0;
		int l=0;
		while(true) {
			
			int num = scan.nextInt();//���� �Է�
			int com = ran.nextInt(3);//com �����Է�
			
			System.out.println(com);
			
			if((num==0 && com==2) || (num==1 && com == 0) || (num==2&&com==1))
			{
				System.out.println("�̰���ϴ�.");
				v++;
			}
			else if((num==0 && com==1) || (num==1 && com == 2) || (num==2 && com==0))
			{
				System.out.println("�����ϴ�.");
				l++;
			}
			else
			{
				System.out.println("�����ϴ�.");
			}
			System.out.println("���� �� "+v+"\t��ǻ�� �� "+l);
			
			if((v==3) || (l==3))break;//3���϶� ��
								
		}
		
	}

}
