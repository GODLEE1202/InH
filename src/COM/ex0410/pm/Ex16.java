package COM.ex0410.pm;

public class Ex16 {

	public static void main(String[] args) {
		/*
		 * break;
		 * �ݺ����� ���������� ���� ��ɾ�
		 * �ݺ��� ���߿� break�� ������ �Ǹ� while���� ������ ������ �ȴ�.
		 * continue;
		 * �ݺ����� Ư�� ������ �Ұ��ϱ� ���� ��ɾ�
		 * �ش� ��ɾ ���� �� ��� ��ɾ� �Ʒ��� �������� ���� �����ǰ� ������ ó������ ���ƿ´�.
		 * ������ ���� ���������� ������ ��� ���� ������ �� ���� �ֱ� ������ continue �� �տ� ���������� �ξ�� �Ѵ�.
		 * 
		 */
		
		
		int a = 1;
		
		while(a<=10) {
			a++;
			if(a==7)continue;
			System.out.println(a);
			//if(a==5)break;
			
		}

	}

}
