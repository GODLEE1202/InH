package coding;

import java.util.Scanner;

public class Code2448 {
	
	//N�� �׻� 3*2^k ���̴�. (3, 6, 12, 24, 48, ...) (k<=10)
	String g = " ";
	String s = "*";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
			new Code2448().makeStar(N);	
		

	}
	private void makeStar(int n) {	
		System.out.println(g+g+s+g+g);		//���� ������ ������ N-1	//���� ���� = 1	//������ ������ ���� N-1 // �Ѱ��� 2N-1
		System.out.println(g+s+g+s+g);	//N-2				//
		System.out.println(s+s+s+s+s);				//N-3
	}
	private void dofor() {
		
	}
}