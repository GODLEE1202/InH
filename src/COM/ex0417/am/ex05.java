package COM.ex0417.am;

public class ex05 {

	public static void main(String[] args) {
		/*
		 * ��ü ���� ���α׷���
		 * ��ü�� ������� ���α׷��� �ϴ� ���
		 * java�� Ŭ������ ������� ��ü�� �����Ͽ� ���� ���α׷��� �ϴ� ����� ä��
		 * ���� ��ü�� �����ϴ� ����� Ŭ������ �����ϰ� �ش� Ŭ�������� ��ü�� �Ӽ��� ���� �������/�ʵ� �� ����� ���� �޼���� �ش簴ü�� ������
		 * java���� �����Ǵ� ��ü�� ����� instance(�ν��Ͻ�)�� �����ϰ� ���� �ν��Ͻ��� Ŭ������ �̸� =new Ŭ������() ���·� �����Ͽ� �����Ҽ� �ִ�
		 */
		
		car car1 = new car();
		car car2 = new car();
		car1.����������();
		car1.�극��ũ������();
		System.out.println(car1.����);
		
		System.out.println(car1.����);
		
		System.out.println(car2.����);
		car2.����="����";
		System.out.println(car2.����);
		System.out.println(car1.����);
	
	}

}

