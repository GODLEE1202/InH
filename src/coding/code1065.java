package coding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Code1065 {
	
	// 한수 = 각 자리수가 등차수열을 이루는 수 ex) 147 1, 4, 7의 차는 3으로 등차수열
	// 그렇다면~ 숫자를 입력하면 각자리수를 넣을 arraylist를 만듬 1<=N<=1000 
	// 1~99까지의 수는 한수 123부터 한수 135 147 159
	// 결과값은 N이하 한수의 개수
	static ArrayList<Integer> hanNum = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n>=1 && n<=1000) {
			for (int i = 1; i <= n; i++) {
				if(i==10|i==20|i==30|i==40|i==50|i==60|i==70|i==80|i==90|i==210|i==420|i==630|i==840) {	//0이 들어가면 계산이 이상해짐 문제점!!!
					//| i == 101 | i ==202 | i==303 | i== 404 |i==505|i==606|i==707|i==808|i==909
					//System.out.println(i+"은 한수");
					hanNum.add(i);
				}
				else if (i==100 | i ==1000) {
					//System.out.println(i+"는 한수 아님");
				}
				else{
					new Code1065().task(i);
					
				}
				
			}
			//System.out.println("한수의 개수 : "+hanNum.size());
			System.out.println(hanNum.size());
			//System.out.println(hanNum.get(0));
			
		}else {
			//System.out.println("다시 입력");
		}
		
		
		
		
	}
	
	
	public int remaind(int remaindNum) {	//나머지 계산 
		int a =(int)(remaindNum) % (int)(Math.pow(10, (int)(Math.log10(remaindNum)))); 
		return a;
	}
	
	public int division(int divisionNum) {	//몫 계산
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
			//System.out.println("인덱스 3 값 : "+value[lognum]);
			remValue[lognum] = new Code1065().remaind(n);
			//System.out.println("인덱스 3 나머지 : "+ remValue[lognum]);
			
			for(int i = lognum; i > 0; i--) {
				value[i - 1] = new Code1065().division(remValue[i]);
				remValue[i -1] = new Code1065().remaind(remValue[i]);
			}
			
			//ArrayList<Integer> checkNum = new ArrayList<Integer>();
			Set<Integer> checkNum = new HashSet<Integer>();	//각 자리별 차수가 같다면 중복값으로 1개의 값만 들어감 
			//한수 계산
			for (int i = 0; i < lognum; i++) {
				//System.out.println("자릿수 차 : "+ Math.abs(value[i] - value[i+1]));
				//checkNum.add(Math.abs(value[i] - value[i+1])); //한수는 절대값하면 안됨
				checkNum.add(value[i+1] - value[i]);
			}
			
			//System.out.println(checkNum.size());
			if(checkNum.size()<=1) {
				System.out.println("숫자 "+ n +"은 한수");
				hanNum.add(n);
			}
			else {
				System.out.println("숫자 " + n + "은 한수가 아님");
			}
		}
		
		catch (Exception e) {
			e.getMessage();
		}
		
		
	}

}
