package coding;

public class tttttt {

	public static void main(String[] args) {
		
//		int firstNum = (int)(257 / Math.pow(10, (int)(Math.log10(257))));
//		int rNum = (int)(257 % Math.pow(10, (int)(Math.log10(257))));
//		int secondNum = (int)(rNum / Math.pow(10, (int)(Math.log10(rNum))));
//		int srNum = (int)(rNum % Math.pow(10, (int)(Math.log10(rNum))));
		
		//System.out.println((int)(Math.pow(10, (int)(Math.log10(257)))));
		//System.out.println((int)(Math.log10(257)));
		
		/*System.out.println(firstNum);
		System.out.println(rNum);
		System.out.println(secondNum);
		System.out.println(srNum);
		System.out.println((int)(Math.pow(10, 0)));
		System.out.println("----------------------------------");
		int n = 158;
		int i = (int)(Math.log10(n));
		int[] indexNum;
		for (int j = i; j >= 0; j--) { //j�� �ڸ���
			
			//int firstN = (int)(n / Math.pow(10, j));	//�Է°��� ù°�ڸ���
			//System.out.println(j+"�����ڸ��� :"+ firstN);
			
			int rN = (int)(n % Math.pow(10, j));	//�Է°��� ù°�ڸ� ���� �A ������
			
			System.out.println(j+"��° ������ : " +rN);
			
			//int secondN =  (int)(rN / Math.pow(10, j));
			//System.out.println("�������� �ڸ���"+ secondN);
			
		}*/
		int n = 1567;	//�Է°�
		int gn = (int)(Math.log10(n));// �ڸ��� ���� = 3
		System.out.println(gn);
		
		int[] r = new int[gn+1];
		int[] j = new int[gn+1];
		
		r[gn] = new tttttt().result(n);//��  r[3] = 1
		j[gn] = new tttttt().remaind(n);//������ j[3] = 567
		
		for (int i = gn; i > 0; i--) { //3�� �����鼭 [2][1][0]�� �� �ֱ�
			r[i-1] =  new tttttt().result(j[i]); // ��
			j[i-1] = new tttttt().remaind(j[i]); //������
			
			System.out.println(i+"��° �迭" + r[i] +" : "+  j[i]);
			System.out.println(i);
		}
		System.out.println(r[3]);
		System.out.println(r[2]);
		System.out.println(r[1]);
		System.out.println(r[0]);
	}
	public int remaind(int rm) {
		return (int)(rm % (int)(Math.pow(10, (int)(Math.log10(rm)))));
		
	}
	public int result(int rs) {
		
		return (int)(rs / (int)(Math.pow(10, (int)(Math.log10(rs)))));
	}
	
}
