package COM.ex0423.pm;

public class Ex03InstanceOf {
	
	/*
	 * instanceof
	 * �ش� ��ü�� �θ� ��ü�� Ȯ���ϰ��� �� ��� ���̴� ��ɾ�
	 * �ش� ��ü�� �θ�ü�� ���� ���� true �ƴϸ� false
	 * �񱳴���� �Ǵ� ��ü�� ������ ���� �θ�ü�� �����ʿ� ��ġ�Ѵ�.
	 * 1.5 ���߹ݿ� ���� ����
	 * 
	 */
	
	public static void main(String[] args) {
		TvProduct tv = new TvProduct();
		if(tv instanceof TV)
		{
			System.out.println("�ش� ��ü�� TV�� �ڽİ�ü�Դϴ�.");
		}
	}
	
}
