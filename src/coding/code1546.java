package coding;

import java.util.Scanner;

public class code1546 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //���� ����
		double[] score = new double[n]; //����
		double sumscore = 0; //�����հ�
		double M = 0; //�ִ�����
		
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
