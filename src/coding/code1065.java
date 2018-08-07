package coding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Code1065 {
	
	// �Ѽ� = �� �ڸ����� ���������� �̷�� �� ex) 147 1, 4, 7�� ���� 3���� ��������
	// �׷��ٸ�~ ���ڸ� �Է��ϸ� ���ڸ����� ���� arraylist�� ���� 1<=N<=1000 
	// 1~99������ ���� �Ѽ� 123���� �Ѽ� 135 147 159
	// ������� N���� �Ѽ��� ����
	static ArrayList<Integer> hanNum = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n>=1 && n<=1000) {
			for (int i = 1; i <= n; i++) {
				if(i==10|i==20|i==30|i==40|i==50|i==60|i==70|i==80|i==90|i==210|i==420|i==630|i==840) {	//0�� ���� ����� �̻����� ������!!!
					//| i == 101 | i ==202 | i==303 | i== 404 |i==505|i==606|i==707|i==808|i==909
					//System.out.println(i+"�� �Ѽ�");
					hanNum.add(i);
				}
				else if (i==100 | i ==1000) {
					//System.out.println(i+"�� �Ѽ� �ƴ�");
				}
				else{
					new Code1065().task(i);
					
				}
				
			}
			//System.out.println("�Ѽ��� ���� : "+hanNum.size());
			System.out.println(hanNum.size());
			//System.out.println(hanNum.get(0));
			
		}else {
			//System.out.println("�ٽ� �Է�");
		}
		
		
		
		
	}
	
	
	public int remaind(int remaindNum) {	//������ ��� 
		int a =(int)(remaindNum) % (int)(Math.pow(10, (int)(Math.log10(remaindNum)))); 
		return a;
	}
	
	public int division(int divisionNum) {	//�� ���
		//System.out.println("aaaaaaa"+divisionNum);
		int a =(int)(divisionNum) / (int)(Math.pow(10, (int)(Math.log10(divisionNum))));
		//System.out.println("bbb"+a);
		return a;
	}
	

	public void task(int n) {
		int hansu = 0;
		try {
			int lognum = (int)(Math.log10(n));
			//System.out.println(lognum);
			int[] value  = new int[lognum + 1];
			int[] remValue = new int[lognum + 1];
			
			value[lognum] = new Code1065().division(n);
			//System.out.println("�ε��� 3 �� : "+value[lognum]);
			remValue[lognum] = new Code1065().remaind(n);
			//System.out.println("�ε��� 3 ������ : "+ remValue[lognum]);
			
			for(int i = lognum; i > 0; i--) {
				value[i - 1] = new Code1065().division(remValue[i]);
				remValue[i -1] = new Code1065().remaind(remValue[i]);
			}
			
			//ArrayList<Integer> checkNum = new ArrayList<Integer>();
			Set<Integer> checkNum = new HashSet<Integer>();	//�� �ڸ��� ������ ���ٸ� �ߺ������� 1���� ���� �� 
			//�Ѽ� ���
			for (int i = 0; i < lognum; i++) {
				//System.out.println("�ڸ��� �� : "+ Math.abs(value[i] - value[i+1]));
				//checkNum.add(Math.abs(value[i] - value[i+1])); //�Ѽ��� ���밪�ϸ� �ȵ�
				checkNum.add(value[i+1] - value[i]);
			}
			
			//System.out.println(checkNum.size());
			if(checkNum.size()<=1) {
				System.out.println("���� "+ n +"�� �Ѽ�");
				hanNum.add(n);
			}
			else {
				System.out.println("���� " + n + "�� �Ѽ��� �ƴ�");
			}
		}
		
		catch (Exception e) {
			e.getMessage();
		}
		
		
	}

}
