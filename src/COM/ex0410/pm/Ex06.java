package COM.ex0410.pm;

public class Ex06 {

	public static void main(String[] args) {
		//��Ʈ ������ 
		/*
		 * �������� 2��Ʈ ���·� �����ϱ� ���� ���̴� ������
		 * & ���ڸ� ���� ���� 1�̸� 1 �ϳ��� 0�̸� 0
		 * | ���ڸ� ���� ���� �ϳ��� 1�̸� 1 �ƴϸ� 0
		 * ^�� �ڸ��� ���� ������� 0 �ƴϸ� 1
		 *  >> �� ���� ���� ���� ���� 0 Ȥ�� 1�� ä��鼭 ���������� �̵�
		 *  >>> �� ���� ���� ���� ������� 0���� ä��鼭 ������ ����Ʈ
		 *  << �������� �̵�
		 */
		
		int x = 2;
		System.out.println(x <<2); //0011<<2 1000 -> 8
		System.out.println(x>>1); // 0011>>1 0001 -> 1
		
		int y = 3;
		System.out.println(x&y); //0011 & 0011 -> 2
		System.out.println(x|y); //0011 | 0011 -> 0011 => 3
		System.out.println(x^y); //0010 ^ 0011 -l>0001
		
		int z = 178;
		System.out.println(z>>>3);
		System.out.println(z>>3);
	
		
		
	}

}
