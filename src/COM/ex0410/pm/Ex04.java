package COM.ex0410.pm;

public class Ex04 {

	public static void main(String[] args) {
		// �� ������
		/* boolean���� Ȥ�� boolean ���� ����� �ϴ� ���ǽ��� ����ϴ� ������
		 * ���ǽİ��� ������ ���ؼ� ���� ������ ������ ���� �� �ִ�.
		 * �� �����ڴ� and(&&), or(||), not(!)�� �����ȴ�.
		 * && �� ���� ���� ���̸� ��, �ϳ��� �����̸� ����
		 * || �� ���� �� �� �ϳ��� ���̸� �� �ƴϸ� ����
		 * ! ���������ڶ�� �θ��� ���� �������� ������ ������ 
		*/
		int x1 = 3;
		int y1 = 5;
		System.out.println(x1>2 && y1<7);
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		
		System.out.println((true || true));
		System.out.println(true || false);
		System.out.println(false || false);
		
		System.out.println(!true);
		System.out.println(!false);

		
	}

}
