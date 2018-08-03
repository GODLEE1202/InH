package coding;

import java.util.Scanner;

public class code1546 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //과목 개수
		double[] score = new double[n]; //점수
		double sumscore = 0; //점수합계
		double M = 0; //최대점수
		
		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
		}
		
		for (int i = 0; i < score.length; i++) {
			if(M < score[i]) {
				M = score[i];
			}
			
		}
		for (int i = 0; i < score.length; i++) {
			score[i] = score[i]/M*100;
			sumscore += score[i];
		}
		System.out.println(sumscore/n);
	}
}
