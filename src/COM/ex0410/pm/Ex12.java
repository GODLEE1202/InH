package COM.ex0410.pm;

public class Ex12 {

	public static void main(String[] args) {
		/*
		 * switch ~ case
		 * if else if else ����ó�� ����� �� �ִ� �� �ٸ� ���ǹ�
		 * switch�� ���� �񱳰��� �����̸� ���ǽ��� �� �� ����.
		 * case���� ���Ϸ��� ���� ������ ���� ������ ���� �񱳸��� �����ϸ� �� ������ ���� �� ���� �Ǻ��� �Ұ����ϴ�.
		 * case������ ������ ���� �񱳽� �ش� case�� ������ ��� �ش�case�� ���� �� �ƴ϶� �Ʒ��ִ� �����鵵 ���� �ϰ� �ȴ�.
		 * �̸� ���� �ϱ� ���� break���� ����ϴµ� break�� ���� switch~ case�� ��ü�� ����������.
		 * if�� ���� �б⸦ �¿�� �ӵ��� �� �����Ƿ� �����ϰ� ������ ����Ͽ� �б�ó���� �� �ÿ��� switch�� ���°��� ����.
		 * ���� ��� case�� ������Ű�� ������ ��� �ǾƷ��� default�� �ξ� if���� else ó�� ����ó���� �Ҽ� �ִ�. 
		 */
		
		
		int x = 6;
		
		
		switch(x) {
		case 1:
			System.out.println(11111);break;
		case 2:
			System.out.println(22222);break;
		case 3:
			System.out.println(33333);break;
		case 4:
			System.out.println(44444);break;
		case 5:
			System.out.println(55555);
		default:
			System.out.println("Default");
		
		}
		

	}

}
