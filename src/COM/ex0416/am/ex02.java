package COM.ex0416.am;

public class ex02 {

	/*
	 * ������ ���� �𸦰�� 
	 * ���� ������ ������ �������� ��� �迭Ÿ������ �����߾���.
	 * ������ �迭 Ÿ������ �����ϰ� �� ��� �޼��带 ȣ���ϱ� �� �迭�� �����ؾ� �ϰ� �ʱ�ȭ �ؾ��ϴ� �������� �����Ǿ���.
	 * �޼����� ���ڸ� "..."�� ����Ͽ� �����ϸ� �޼��� ȣ�� �� �Ѱ��� ���� ���� ���� �ڵ����� �迭�� �����ǰ� �Ű������� ���ȴ�.
	 * �޼��� �ȿ����� �ش� ���ڿ� �����ϱ� ���� ��ġ �迭ó�� �����ϵ��� �ε����� �����Ѵ�.
	 */
	public static void main(String[] args) {
		//method1(1,2);
		int[] arr = {1,2,3,4,5,6};
		method2(arr);
		method3(1,2,3,4,5,6,7,89,90,100,3,90);
		method4(1,"String",0.123,1,2,3,4,5,2,6,2,7,8,989,9,2);
	}
	public static void method1(int i , int j) {
		System.out.println(i+j);
	}
	public static void method2(int[] i) {
		int sum = 0;
		for(int j :i) { //int[] i�迭 ���� ó������ ������ j ������ �ִ´�.
			//System.out.println(j);
			sum += j;
			System.out.println(sum);
		}
	}
	public static void method3(int ...i) {		//���� �������� ...i
		int sum = 0;
		for(int j : i) {
			sum+=j;
		}
		
		System.out.println(sum);
	}
	public static void method4(int i,String s, double d,int ...j) { 	//���Ѻ������� �ֱ��� ���ڰ��� ������ �־���Ѵ�.�����Ұ�
		
	}

}
